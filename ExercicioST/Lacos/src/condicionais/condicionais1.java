package condicionais;
import java.util.Scanner;


public class condicionais1 {


	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n1,n2,contador;
		
		
		System.out.println("Digite um número de 10 a 100: ");
		n1 = read.nextInt();
		
		System.out.println("Digite o segundo número de 10 a 100: ");
		n2 = read.nextInt();

		if (n1>n2) {
		System.out.println("Intervalo Inválido: ");
		
		}else {
			
			for (contador=n1; contador <n2 ; contador++) {
				if (contador % 3 == 0 && contador %5 == 0) {
					System.out.println(contador + "É multiplo de 3 e 5");
					
					read.close();
				}
				
			}
				
		}
		
		
		
			
			
		
		
	
	}	
}
