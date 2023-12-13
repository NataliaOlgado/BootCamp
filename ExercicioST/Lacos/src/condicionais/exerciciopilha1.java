package condicionais;

import java.util.Stack;
import java.util.Scanner;

public class exerciciopilha1 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		Scanner read = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n------------------------------");
			System.out.println("\n Menu da Pilha");
			System.out.println("\n(1) Adicionar Livro na Fila");
			System.out.println("\n(2) Listar todos os Livros");
			System.out.println("\n(3) Retirar livro da Fila ");
			System.out.println("\n(0) Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = read.nextInt();

			switch (op) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o nome cliente: ");
				pilha.push(read.nextLine());
				break;
			case 2:
				System.out.println("\nLista de Todods os clientes: ");
				System.out.println(pilha);
				break;
			case 3:
				if(pilha.isEmpty()) {
				System.out.println("\n Fila Vazia!!! ");
				}else { 
				read.nextLine();
				pilha.pop();
				System.out.println("\n Nome retirado da Fila ");
				}
				break;
				
			case 0:
				System.out.println("\n Programa Finalizado");
				break;
				
				default: System.out.println("\n Opção Invalida!");
				}

		} while (op != 0);

		read.close();
	}

		
	}
	
	