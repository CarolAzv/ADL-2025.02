public class FilaLista implements Fila{
    private int c; //capacidade
    private Object[] a;
    private int i;
    private int f;
    
    public FilaLista(int capacidade){
        i=0;
        f=i;
        c=capacidade;
        a=new Object[capacidade];
    }

    public int size(){
        return (c-i+f)%c;
    }

    public boolean isEmpty(){
        if(size()==0)
            return true;
        return false;
    }

    public int first(){
        if(isEmpty())
            throw new EFilaVazia("A fila está vazia");
        return i;
    }

    public int last(){
        if(isEmpty())
            throw new EFilaVazia("A fila está vazia");
        return f;
    }

    public void enqueue(Object o){
        a[f]=o;
        f++;
        if(f>c)
            f=0;
            if(f==i)
                throw new EFilaCheia("A fila está cheia");
        else if(f==i)
            throw new EFilaCheia("A fila está cheia");
    }

    public Object denqueue(Object o){
        if(isEmpty())
            throw new EFilaVazia("A fila está vazia");
        o=a[i];
        i++;
        if(i>c)
            i=0;
        return o;
    }

    public Object get(int i){
        return a[i];
    }
}