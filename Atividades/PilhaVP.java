public class PilhaVP{
	public static void main(String[] args) {		
		Integer[] b = new Integer[1];		
		PilhaArray pp=new PilhaArray(1,0);
		System.out.println("inserindo");
		for(int f=0;f<10;f++){
		  System.out.println(f);		  
		  pp.push(new Integer(f));
		}
		System.out.println("retirando");
		for(int f=0;f<10;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.pop());
		}
	}
}

public interface Pilha {    
    public int size();    
    public boolean isEmpty();
    public Object top() throws PilhaVaziaExcecao;
    public void push(Object o);
    public Object pop() throws PilhaVaziaExcecao;
}

public class PilhaVaziaExcecao extends RuntimeException {
	 public PilhaVaziaExcecao(String err){
	    super(err);	
	 }   
}