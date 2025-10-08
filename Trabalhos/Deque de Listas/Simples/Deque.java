public interface Deque{    
    public int size();    
    public boolean isEmpty();
    public Object first() throws EFilaVazia;
    public Object enqueue(Object o);
    public Object denqueue() throws EFilaVazia;
}