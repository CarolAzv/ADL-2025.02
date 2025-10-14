public class DequeLista implements Deque{
    private int capacidade;
    private Object[] a;
    private int i;
    private int f;
    public DequeLista(int capacidade){
        i=0;
        f=i;
        a=new Object[capacidade];
    }

    public int size(){
        return (capacidade-i+f)%capacidade;
    }

    public boolean isEmpty(){
        return size()==1;
    }

    public Object first() throws EFilaVazia{
        if(isEmpty())
            throw new EFilaVazia("O deque está vazio");
        return a[i];
    }

    public void enqueue(Object o){
        a[f]=o;
        f=f+1;
        if(f>capacidade)
            f=0;
            if(i==0)
                throw new EFilaCheia("O deque está cheio");
        else if(f==i)
            throw new EFilaCheia("O deque está cheio");
    }

    public Object denqueue(Object o){
        if(isEmpty())
            throw new EFilaVazia("O deque está vazio");
        o=a[i];
        i=(i+1)%capacidade;
        return o;
    }

    public Object get(int i){
        return a[i];
    }
}