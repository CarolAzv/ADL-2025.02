public class PilhaArray implements Pilha {
    private int capacidade;
    private Object[] a;
    private int t;
    private int FC;
    private int ultimover;
    private int ultimopre;
    public PilhaArray(int capacidade, int crescimento, int ultimover, int ultimopre){
        ultimover = -1;
        ultimopre = capacidade-1;
        this.capacidade=capacidade;
        t=-1;
        FC=crescimento;
        if (crescimento<=0)
            FC=0;
        a=new Object[capacidade];
    }

    //PUSH
    public void push(Object o){
        if(t>=capacidade-1){
        if(FC==0)
            capacidade*=2;
        else
            capacidade+=FC;
        Object b[]=new Object[capacidade];
        for(int f=0;f<a.length;f++)
            b[f]=a[f];
        a=b;
        }
        a[++t]=o;
    }
    

    //POP
    public Object pop()throws PilhaVaziaExcecao {
        if(isEmpty())
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        Object r=a[t--];
        return r;
    }

    //PUSH VERMELHO
    public void pushvermelho(Object o){
        if(ultimover>=capacidade-1){
            if(FC==0)
                capacidade*=2;
            else
                capacidade+=FC;
            Object b[]=new Object[capacidade];
            for(int f=0;f<a.length;f++)
                b[f]=a[f];
            a=b;
        }
        a[++ultimover]=o;
    }

    //POP VERMELHO
    public Object popvermelho()throws PilhaVaziaExcecao {
        if(isEmpty())
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        Object r=a[ultimover--];
        return r;
    }

    
    //PUSH PRETO
    public void pushpreto(Object o){
        if(t>=capacidade-1){
            if(FC==0)
                capacidade*=2;
            else
                capacidade+=FC;
            Object b[]=new Object[capacidade];
            for(int f=0;f<a.length;f++)
                b[f]=a[f];
            a=b;
        }
        a[--ultimopre]=o;
    } 
    
    //POP PRETO
    public Object poppreto()throws PilhaVaziaExcecao {
        if(isEmpty())
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        Object r=a[ultimopre++];
        return r;
    }

    //TOP
    public Object top()throws PilhaVaziaExcecao {
        if(isEmpty())
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        return a[t];
    }

    //BOOLEAN
    public boolean isEmpty(){
        return t==-1;
    }

    //SIZE
    public int size(){
        return t+1;
    }
}
