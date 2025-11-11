public class FilaRun{
      private static NoInicio s;
      private static NoFim f;
      public static void main(String[] args){
        InicioLista NoInicio = new InicioLista("Começo");
        FimLista NoFim = new FimLista("Fim");
        s.setProximo("Fim");
        f.setAnterior("Fim");
        System.out.println("Criando deque:");
        a = no.getProximo();
        for(int p=0; p<10; p++){
            System.out.println("Inserindo "+p);
            while(a.getProximo()!=null){
                a = a.getProximo();
            }
            a.setProximo(p);
        })
}
