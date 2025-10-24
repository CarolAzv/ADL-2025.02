public interface No{
    public No getProximo();
    public No getAnterior();
    public Object getElemento() throws EDequeVazia;
    public void setElemento(Object o);
    public void setProximo(Object o);
    public void setAnterior(Object o);
}
