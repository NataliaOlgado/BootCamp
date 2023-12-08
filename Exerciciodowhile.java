package LacosCondicionaispack;

import java.util.Scanner;

public class Exerciciodowhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numero,soma=0;
		
		
		do {
			System.out.println ("\n Entre com um numero:  ");
			numero= read.nextInt();
			if (numero > 0) { 
				soma += numero;} 
			}while(numero!=0);
			System.out.println ("\n Somas dos numeros positivos:  " +soma);
				
	
	}

}
