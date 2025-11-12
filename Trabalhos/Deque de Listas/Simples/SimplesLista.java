public class SimplesLista{
    private Object elemento;
    private Object proximo;

    public SimplesLista(Object o){
        elemento = o;
        proximo = null;
    }

    public Object getElemento(){
        return elemento;
    }

    public Object getProximo(){
        if(proximo==null)
            return null;
        return proximo;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public void setProximo(Object o){
        this.proximo = o;  
    }
}