public class NoInicio{
    private Object elemento;
    private Object proximo;

    public NoInicio(Object o){
        elemento = o;
        proximo = null;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setProximo(Object o){
        this.proximo = o;  
    }

    public Object getProximo(){
        if(proximo==null)
            return null;
        return proximo;
    }
}