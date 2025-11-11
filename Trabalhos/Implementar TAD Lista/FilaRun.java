public class FilaRun{
      private static NoInicio s;
      private static NoFim f;
      public static void main(String[] args){
        InicioLista NoInicio = new InicioLista("Começo");
        FimLista NoFim = new FimLista("Fim");
        s.setProximo(f);
        f.setAnterior(s);
}
