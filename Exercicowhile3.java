package LacosCondicionaispack;
import java.util.Scanner;

public class Exercicowhile3 {
	

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int menor21 =0 ,maior50 =0;
		
		System.out.println ("\n Entre com a sua idade:  ");
		int idade= read.nextInt();
		
		while (idade>=0) {
			if (idade < 21) {
				menor21++; 
			}else if (idade >50) {
				maior50++;	
			} 
			System.out.println ("\n Digite uma idade novamente:  ");
			idade = read.nextInt();
			
		}
		System.out.println ("\n Total de pessoas menores de 21 e:  " + menor21);
		System.out.println ("\n Total de pessoas maiores de 50 e:  " + maior50);
		read.close();
		
	}
 
}
