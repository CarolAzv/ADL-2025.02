public interface Sequencia{
    //generico
    public int size();
    public boolean isEmpty();
    //vetor
    public int elemAtRank(int r) throws ESequenciaVazia;
    public void replaceAtRank(int r, Object o) throws ESequenciaVazia;
    public void insertAtRank(int r, Object o) throws ESequenciaVazia;
    public void removeAtRank(int r) throws ESequenciaVazia;
    //lista
    public Object first();
    public Object last();
    public Object before(Object n);
    public Object after(Object n);
    public Object replaceElement(Object n, Object o);
    public Object swapElement(Object n, Object q);
    public Object insertBefore(Object n, Object o);
    public Object insertAfter(Object n, Object o);
    public Object insertFirst(Object o);
    public Object insertLast(Object o);
    public void remove(Object n);
    //ponte
    public Object atRank(int r) throws ESequenciaVazia;
    public int rankOf(Object n) throws ESequenciaVazia;
}