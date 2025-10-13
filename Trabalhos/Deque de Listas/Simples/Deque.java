public interface Deque{    
    public int size();    
<<<<<<< HEAD
    public boolean isEmpty();
    public Object first() throws EFilaVazia;
    public void enqueue(Object o);
    public Object denqueue(Object o) throws EFilaVazia;
    public Object get(int i);
}
=======
    public boolean estaVazia();
    public Object inicio() throws EFilaVazia;
    public Object enqueue(Object o);
    public Object denqueue() throws EFilaVazia;
}
>>>>>>> dc5a3a0a0d4ba68539287b1ecad9c02266b6120e
