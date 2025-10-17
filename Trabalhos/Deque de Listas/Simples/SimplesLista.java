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
            return null;
        return proximo;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public void setProximo(Object o){
        this.proximo = new SimplesLista(o);  
    }
}