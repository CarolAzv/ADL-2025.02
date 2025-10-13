public interface Deque{    
    public int size();
    public boolean isEmpty();
    public Object first() throws EFilaVazia;
    public void enqueue(Object o);
    public Object denqueue(Object o) throws EFilaVazia;
    public Object get(int i);
}
