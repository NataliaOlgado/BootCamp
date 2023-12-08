package LacosCondicionaispack;
import java.util.Scanner;

public class lacosrepeticaowhile {

	public static void main(String[] args) {
Scanner read = new Scanner(System.in);
		
System.out.println ("\n Digite o Primeiro numero:  ");
int numero1 = read.nextInt();

System.out.println ("\n Digite o Segundo numero:  ");
int numero2 = read.nextInt();
int contador;
read.close();

if (numero1>numero2) {
	System.out.println ("\n Intervalo invalido:  ");		
}else {
	for ( contador=numero1; contador < numero2 ;contador++) {
		if (contador % 3 == 0 && contador %5 == 0) {
			System.out.println(contador + "É multiplo de 3 e 5");
		}
	}
}
		
	read.close();
	}

}
