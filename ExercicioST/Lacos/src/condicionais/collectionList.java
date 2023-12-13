package condicionais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionList {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		ArrayList<String> listaDeCores = new ArrayList<>(); 
		
		for(int i = 0; i < 5; i++) {
		
		System.out.println("\n Lista de Cores: ");
				System.out.println("\n Insira a cor desejada: ");
				String cor = read.nextLine();
				listaDeCores.add(cor); }
				
		 System.out.println("\n Listar todas as todas as cores !!!");	
		 for(String cor :listaDeCores ) {
			System.out.println(cor);
		}

		 Collections.sort(listaDeCores);
		 System.out.println("Ordenar Cores");
		 
		 for(String cor :listaDeCores ) {
			 System.out.println(cor);
		 }
		 
		 read.close();
			 
			
		
		
		
	

		
}
		
	}