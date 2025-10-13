public class DequeRun {
    public static void main(String[] args){
        DequeLista dq = new DequeLista(10);

        System.out.println("Inserindo elementos no deque:");
        for(int f=0; f<10; f++){
            System.out.println("Inserindo " + f + " na frente");
            dq.enqueue(Integer.valueOf(f));
        }
        
        System.out.println("Mostrando deque:");
        if(dq.isEmpty())
            throw new EFilaVazia("O deque está vazio");
        System.out.print("Itens da pilha: ");
        for (int i = 0; i < dq.size(); i++) {
            System.out.print(dq.get(i) + " ");
        }
  
        System.out.println("Removendo elementos do deque:");
        for (int f = 0; f < 5; f++) {
            System.out.print("Removendo elemento: ");
            System.out.println(dq.denqueue());
        }
    }
}