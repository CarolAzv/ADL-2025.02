/*public class DuploLista implements Duplo{
    private int c; //capacidade
    private Object[] a;
    private int i;
    private int f;
    public DuploLista(int capacidade){
        i=0;
        f=i;
        c=capacidade;
        a=new Object[capacidade];
    }

    public int size(){
        return (c-i+f)%c;
    }

    public boolean isEmpty(){
        if(size()==0)
            return true;
        return false;
    }

    public int first(){
        if(isEmpty())
            throw new EDequeVazia("O deque está vazio");
        return i;
    }

    public int last(){
        if(isEmpty())
            throw new EDequeVazia("O deque está vazio");
        return f;
    }

    public Object inStart(Object o){
        
    }

    public Object removeStart(){}

    public Object inEnd(Object o){}

    public Object removeEnd(){}
}
*/