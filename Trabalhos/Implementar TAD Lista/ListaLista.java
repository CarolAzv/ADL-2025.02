public class ListaLista implements No{
    private Object elemento;
    private No proximo;
    private No anterior;

    public ListaLista(Object o){
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