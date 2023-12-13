package condicionais;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioFila1 {

	public static void main(String[] args) {

		Queue<String> filaCliente = new LinkedList<String>();
		Scanner read = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n------------------------------");
			System.out.println("\n Menu da fila");
			System.out.println("\n(1) Adicionar Cliente na Fila");
			System.out.println("\n(2) Listar todos os Clientes");
			System.out.println("\n(3) Retirar Cliente da Fila ");
			System.out.println("\n(0) Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = read.nextInt();

			switch (op) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o nome cliente: ");
				filaCliente.add(read.nextLine());
				break;
			case 2:
				System.out.println("\nLista de Todods os clientes: ");
				System.out.println(filaCliente);
				break;
			case 3:
				if(filaCliente.isEmpty()) {
				System.out.println("\n Fila Vazia!!! ");
				}else { 
				read.nextLine();
				filaCliente.remove(read.nextLine());
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