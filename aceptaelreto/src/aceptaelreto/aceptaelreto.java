package aceptaelreto;
import java.util.Scanner;

public class aceptaelreto {
	

	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner(System.in);

		int numero = 0;

		
		numero = entradaEscaner.nextInt();

		for (int i=0; i<numero;i++){
			if (numero <= 0 || numero <= 5) {
				System.out.println("Hola mundo.");
			}
			}
		
	
	}
}
