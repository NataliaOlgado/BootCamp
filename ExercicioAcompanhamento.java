package LacosCondicionaispack;
import java.util.Scanner;

public class ExercicioAcompanhamento {

	public static void main(String[] args) {
		
		/* Operador Logico E
		 * 
		 * 
		 * Entrada 1   Entrada 2   Saida
		 * V			v			V
		 * V			F			F
		 * F			V			F
		 * V			V			F
		 * 
		 * 
		 * Operador Logico ou
		 * 
		 * 
		 * Entrada 1   Entrada 2   Saida 
		 * V			V			V
		 * F			V			V
		 * V			F			V
		 * F			F			F
		 * 
		 * */
		
		double n1,n2,n3,media;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1: ");
		 n1= read.nextDouble();
		System.out.println("Entre com a nota 2: ");
		 n2= read.nextDouble();
		System.out.println("Entre com a nota 3: ");
		n3= read.nextDouble();
		
		media= (n1+n2+n3)/3;
		
		System.out.println("Média Aritmética: " +media);
		 
		if (media>=7 && media <= 10) {
			System.out.println("\nVocê foi aprovado!!!! ");
		} else if (media>= 5 && media<=7) {
			System.out.println("\nVocê foi Exame!!!! ");
		} else if (media>= 0 && media<=5) {
			System.out.println("\nVocê foi Reprovado!!!! ");
		}else{
		System.out.println("\n Média Invalida!!!! ");
		
		read.close();
		}
	}

}
