public interface Deque{    
    public int size();    
    public boolean estaVazia();
    public Object inicio() throws EFilaVazia;
    public Object enqueue(Object o);
    public Object denqueue() throws EFilaVazia;
}
