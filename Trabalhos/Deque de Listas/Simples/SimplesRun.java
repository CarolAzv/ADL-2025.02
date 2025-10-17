public class SimplesRun{
    private static No a;
    public static void main(String[] args){
        SimplesLista no = new SimplesLista("Start");
        no.setProximo("End");
        System.out.println("Criando deque:");
        a = no.getProximo();
        for(int p=0; p<10; p++){
            System.out.println("Inserindo "+p);
            while(a.getProximo()!=null){
                a = a.getProximo();
            }
            a.setProximo(p);
        }
        /*
        System.out.println("Mostrando deque:");
        if(no.getProximo()==null)
            throw new EDequeVazia("Não há próximo nó");
        System.out.print("Itens do deque: ");
        no.getElemento();
        while(no.getProximo()!=null){
            System.out.print(no.getProximo()+" ");
        }
        */
        System.out.println("Removendo elementos da fila:");
        for(int p=0; p<10; p++){
            System.out.print("Removendo elemento: ");
            a=no.getProximo();
            System.out.println(" - "+a);
            a=a.getProximo();
            no.setProximo(a);
        }
    }
}
