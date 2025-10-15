public class DequeLista implements Deque{
    private int c; //capacidade
    private Object[] a;
    private int i;
    private int f;
    public DequeLista(int capacidade){
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
            throw new EFilaVazia("O deque está vazio");
        return i;
    }

    public int last(){
        if(isEmpty())
            throw new EFilaVazia("O deque está vazio");
        return f;
    }

    public void enqueue(Object o){
        a[f]=o;
        f++;
        if(f>c)
            f=0;
            if(f==i)
                throw new EFilaCheia("O deque está cheio");
        else if(f==i)
            throw new EFilaCheia("O deque está cheio");
    }

    public Object denqueue(Object o){
        if(isEmpty())
            throw new EFilaVazia("O deque está vazio");
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