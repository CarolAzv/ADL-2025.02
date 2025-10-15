public interface Deque{    
    public int size();
    public boolean isEmpty();
    public int first() throws EFilaVazia;
    public int last() throws EFilaVazia;
    public void enqueue(Object o);
    public Object denqueue(Object o) throws EFilaVazia;
    public Object get(int i);
}
