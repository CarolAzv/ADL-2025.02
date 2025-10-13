public class DequeLista implements Deque{
    private int capacidade;
    private Object[] a;
    private int i;
    private int f;
    public DequeLista(int capacidade){
        f=i+1;
        i=0;
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
        if(capacidade-1==size())
            throw new EFilaVazia("O deque está vazio");
        a[f]=o;
        f=(f+1)%capacidade;
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