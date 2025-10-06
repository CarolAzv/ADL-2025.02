public class PilhaFinalArray {
    private int[] array;
    private int topo; // aponta para o próximo espaço livre (de trás para frente)

    public PilhaFinalArray(int capacidade) {
        array = new int[capacidade];
        topo = capacidade; // começa no final do array
    }

    public boolean estaVazia() {
        return topo == array.length;
    }

    public boolean estaCheia() {
        return topo == 0;
    }

    public void push(int valor) throws Exception {
        if (estaCheia()) {
            throw new Exception("Pilha cheia!");
        }
        topo--;
        array[topo] = valor;
    }

    public int pop() throws Exception {
        if (estaVazia()) {
            throw new Exception("Pilha vazia!");
        }
        int valor = array[topo];
        topo++;
        return valor;
    }

    public int peek() throws Exception {
        if (estaVazia()) {
            throw new Exception("Pilha vazia!");
        }
        return array[topo];
    }
}