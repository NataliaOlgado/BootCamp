package LacosCondicionaispack;
import java.util.Scanner;

public class Exercicio2LC {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Entre com um número: ");
		numero=read.nextDouble();
		
		if(numero%2==0 && numero>= 0) {
			System.out.println("Este número é par!!! ");
		}
		
		else if(numero%2==0 && numero <0) {
			System.out.println("Este número é par e é negativo!!! ");
			
		}	
		
		else if(numero <0) {
			System.out.println("Este número é impar e é negativo!!! ");
		
		} else  {
		System.out.println("Este número é impar e é positivo!!! ");
	
	}
	}

}
