public class PilhaRun{
	public static void main(String[] args){	
		PilhaArray pp = new PilhaArray(10,0);
		System.out.println("inserindo vermelho");
		for(int f=0;f<10;f++){
		  System.out.println(f);		  
		  pp.pushvermelho(Integer.valueOf(f));
		}
		System.out.println("inserindo preto");
		for(int f=0;f<5;f++){
		  System.out.println(f);		  
		  pp.pushpreto(Integer.valueOf(f));
		}

		System.out.println("mostrando pilha");
		pp.mostrarPilha();
    	
		System.out.println("retirando vermelho");
		for(int f=0;f<10;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.popvermelho());
		}
		System.out.println("retirando preto");
		for(int f=0;f<5;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.poppreto());
		}
	}
}
