public class DequeRun {
    public static void main(String[] args){
        DequeLista dq = new DequeLista(10);

        System.out.println("Inserindo elementos no deque:");
        for(int f=0; f<10; f++){
            System.out.println("Inserindo " + f + " na frente");
            dq.enqueue(Integer.valueOf(f));
        }
        
        /*
        * System.out.println("Mostrando deque:");
        * // deque.showDeque(); IMPLEMENTAR
        *   
        *System.out.println("Removendo elementos do deque:");
        *for (int f = 0; f < 5; f++) {
        *    System.out.print("Removendo da frente: ");
        *    // System.out.println(deque.removeFront()); IMPLEMENTAR
        *}
        */
    }
}