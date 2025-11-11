public interface No{
    public Object getProximo();
    public Object getAnterior();
    public Object getElemento() throws EDequeVazia;
    public void setElemento(Object o);
    public void setProximo(Object o);
    public void setAnterior(Object o);
}