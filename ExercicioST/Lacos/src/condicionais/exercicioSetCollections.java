package condicionais;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;


public class exercicioSetCollections {

	public static void main(String[] args) {
		
		Set<Integer> meuSet = new HashSet<>();
		Scanner read = new Scanner(System.in);
		
		System.out.println( "Digite dez valores inteiros sem repetir nenhum: ");
		
		for(int i =0; i<10; i++) {
			System.out.println("Digite o primeiro valor: ");
			int valor=read.nextInt();
			meuSet.add(valor);
			
		}
		
		System.out.println("Lista dados do Set: ");
		Iterator<Integer> interador = meuSet.iterator();
		while(interador.hasNext()){
			System.out.println(interador.next());
		}
		
		read.close(); 
			
		}
		
		
			
		}

	


