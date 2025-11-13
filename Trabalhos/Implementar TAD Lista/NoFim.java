public class NoFim{
    private Object elemento;
    private Object anterior;

    public NoFim(Object o){
        elemento = o;
        anterior = null;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setAnterior(Object o){
        this.anterior = o;  
    }

    public Object getAnterior(){
        if(this.anterior==null)
            return null;
        return anterior;
    }
}