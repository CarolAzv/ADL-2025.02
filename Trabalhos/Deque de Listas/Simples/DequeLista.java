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

    public void enqueue(Object o){
        a[++i]=o;
    }
}
