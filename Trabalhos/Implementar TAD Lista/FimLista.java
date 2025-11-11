public class FimLista implements NoFim{
    private Object elemento;
    private Object anterior;

    public FimLista(Object o){
        elemento = o;
        anterior = null;
    }

    public Object getElemento(){
        return elemento;
    }

    public No getAnterior(){
        if(anterior==null)
            return null;
        return anterior;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public void setAnterior(Object o){
        this.anterior = new SimplesLista(o);  
    }
}