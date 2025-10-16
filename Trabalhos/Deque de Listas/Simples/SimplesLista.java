public class SimplesLista implements No{
    private Object elemento;
    private No proximo;

    public SimplesLista(Object o){
        elemento = o;
        proximo = null;
    }

    public Object getElemento(){
        return elemento;
    }

    public No getProximo(){
        if(proximo==null)
            return getElemento()
        return proximo;
    }

    public void setElemento(Object o){
        elemento = o;
    }

    public void setProximo(Object o){
        proximo = new SimplesLista(o);  
    }
}