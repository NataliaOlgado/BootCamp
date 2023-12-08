package LacosCondicionaispack;
import java.util.Scanner;

public class ExercicioIf1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double notaA,notaB,notaC,resultado;
		
		System.out.println("Entre com a nota A: ");
		 notaA= read.nextDouble();
		System.out.println("Entre com a nota B: ");
		 notaB= read.nextDouble();
		System.out.println("Entre com a nota C: ");
		notaC= read.nextDouble();
		
		resultado = (notaA + notaB); 
		
		if (resultado > notaC){
			System.out.println("\n Valor Maior que a  nota C !!!!  Valor: " +resultado);
		}
		else if (resultado < notaC) {
			System.out.println("\n Valor Menor a nota C !!!! Valor: " +resultado);
		}
		else if (resultado == notaC) {
			System.out.println("\n Valor é igual a nota C !!!! Valor:  " +resultado);
			
			read.close();
	}

	}

}
