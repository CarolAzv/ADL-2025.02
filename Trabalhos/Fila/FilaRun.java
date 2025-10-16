public class FilaRun {
    public static void main(String[] args){
        FilaLista dq = new FilaLista(10);

    System.out.println("Inserindo elementos na fila:");
    for(int p=10; p<19; p++){
        System.out.println("Inserindo "+p);
            dq.enqueue(Integer.valueOf(p));
        }
        
        System.out.println("Mostrando fila:");
        if(dq.isEmpty())
            throw new EFilaVazia("A fila está vazio");
        System.out.print("Itens da fila: ");
        for (int q=0; q<dq.size(); q++) {
            System.out.print(dq.get(q)+" ");
        }
  
        System.out.println("Removendo elementos da fila:");
        for(int p=0; p<5; p++) {
            System.out.print("Removendo elemento: ");
            System.out.println(" - "+dq.denqueue(dq));
        }

        System.out.println("Mostrando fila:");
        if(dq.isEmpty())
            throw new EFilaVazia("A fila está vazio");
        System.out.print("Itens da fila: ");
        for(int i=dq.first(); i<dq.last(); i++) {
            System.out.print(dq.get(i) + " ");
        }
    }
}