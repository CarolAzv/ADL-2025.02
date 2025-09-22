public class PilhaVP{
	public static void main(String[] args) {
        int[] PilhaArray = new int[100];
		Integer[] b = new Integer[1];		
		PilhaArray pp = new PilhaArray(1,0);
		System.out.println("inserindo");
		for(int f=0;f<10;f++){
		  System.out.println(f);		  
		  pp.push(Integer.valueOf(f));
		}
		System.out.println("retirando");
		for(int f=0;f<10;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.pop());
		}
	}
}