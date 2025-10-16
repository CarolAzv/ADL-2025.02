public interface No{
    public No getProximo();
    public Object getElemento() throws EDequeVazia;
    public void setElemento(Object o);
    public void setProximo(Object o);
}


/*
public class No{
    private Object elemento;
    private No proximo;
    public Object getElemento() {
        return elemento;}
    public void setElemento(Object o){
        elemento = o;
    }
}
 */