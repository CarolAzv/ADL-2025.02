public class PilhaArray implements Pilha {
    private int capacidade;
    private Object[] a;
    private int t;
    private int FC;
    private int ultimopre;
    public PilhaArray(int capacidade, int crescimento){
        ultimopre = capacidade;
        this.capacidade=capacidade;
        t=-1;
        FC=crescimento;
        if (crescimento<=0)
            FC=0;
        a=new Object[capacidade];
    }

    //PUSH VERMELHO
    public void pushvermelho(Object o){
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

    //POP VERMELHO
    public Object popvermelho()throws PilhaVaziaExcecao {
        if(isEmpty())
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        Object r=a[t--];
        return r;
    }

    
    //PUSH PRETO
    public void pushpreto(Object o){
        if(ultimopre==0){
            if(FC==0)
                capacidade*=2;
            else
                capacidade+=FC;
            Object b[]=new Object[capacidade];
            for(int f=0;f<a.length;f++)
                b[f]=a[f];
            a=b;
        }
        ultimopre--;
        a[ultimopre]=o;
    }

    //POP PRETO
    public Object poppreto()throws PilhaVaziaExcecao {
        if(ultimopre == a.length)
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        Object r=a[ultimopre++];
        return r;
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
