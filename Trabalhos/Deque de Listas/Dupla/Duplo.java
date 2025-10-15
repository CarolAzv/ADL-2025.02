public interface Duplo{   
    public int size();
    public boolean isEmpty();
    public int first() throws EDequeVazia;
    public int last() throws EDequeVazia; 
    public Object inStart(Object o);
    public Object removeStart();
    public Object inEnd(Object o);
    public Object removeEnd();
}