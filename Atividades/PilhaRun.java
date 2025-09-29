public class PilhaRun{
	public static void main(String[] args){	
		PilhaArray pp = new PilhaArray(10,0, 0, 1);
		System.out.println("inserindo");
		for(int f=0;f<10;f++){
		  System.out.println(f);		  
		  pp.pushvermelho(Integer.valueOf(f));
		}
		System.out.println("retirando");
		for(int f=0;f<10;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.popvermelho());
		}
	}
}
