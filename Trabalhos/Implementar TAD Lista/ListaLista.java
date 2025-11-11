public class ListaLista implements No{
    private Object elemento;
    private No proximo;
    private No anterior;

    public ListaLista(Object o){
        elemento = o;
        proximo = null;
        anterior = null;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setProximo(Object o){
        this.proximo = new SimplesLista(o);  
    }

    public Object getProximo(){
        if(proximo==null)
            return null;
        return proximo;
    }

    public void setAnterior(Object o){
        this.anterior = new SimplesLista(o);  
    }

    public Object getAnterior(){
        if(anterior==null)
            return null;
        return anterior;
    }

}
