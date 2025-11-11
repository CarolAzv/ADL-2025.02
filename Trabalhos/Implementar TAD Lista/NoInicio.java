public interface NoInicio{
    public Object getProximo();
    public Object getElemento() throws EDequeVazia;
    public void setElemento(Object o);
    public void setProximo(Object o);
}
