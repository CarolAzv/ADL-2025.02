import java.util.Scanner;
public class ListaRun{
  private static NoInicio s;
  private static NoFim f;
  public static void main(String[] args){
    s = new InicioLista("Começo");
    f = new FimLista("Fim");
    s.setProximo(f);
    f.setAnterior(s);

    Scanner reader = new Scanner(System.in); //lendo
    System.out.println("Adicionar = 1, Remover = 2");
    int n = reader.nextInt(); //deveia ser uma int
    reader.close();

    if(n==1){
      Scanner read = new Scanner(System.in); //lendo
      System.out.println("adicionar elemento: ");
      String a = read.next(); //deveia ser uma string
      read.close();
      
    }

    else if(n==2){
      Scanner read = new Scanner(System.in); //lendo
      System.out.println("Remover elemento da fila:");
      String r = read.next(); //deveia ser uma string
      read.close();
    }
  }
}