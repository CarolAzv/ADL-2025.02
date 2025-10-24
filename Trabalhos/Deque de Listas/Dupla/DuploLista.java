public class DuploLista implements No{
    private Object elemento;
    private No proximo;
    private No anterior;

    public DuploLista(Object o){
        elemento = o;
        proximo = null;
        anterior = "?";
    }

    public Object getElemento(){
        return elemento;
    }

    public No getProximo(){
        if(proximo==null)
            return null;
        return proximo;
    }
    
    public No getAnterior(){
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

    public void setAnterior(Object o){
        this.proximo = new SimplesLista(o);  
    }
}
