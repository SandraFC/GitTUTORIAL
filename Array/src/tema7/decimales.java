package tema7;


import java.util.Arrays;
import java.util.Scanner;

public class decimales {

	public static void main(String[] args) {
	Scanner entradaEscaner = new Scanner(System.in);
	
	int tamaño=0;
	double hueco=0;
	
	System.out.println("ELIGE EL TAMAÑO DEL ARRAY: ");
	tamaño = entradaEscaner.nextInt();
	
	double[] decimal = new double[tamaño];
	
	System.out.println(" ");
	
	 
	for (int i=0; i<tamaño; i++){
		System.out.println("escribe numero con decimal en el hueco: " + i);
		hueco = entradaEscaner.nextInt();
		
		decimal[i]=hueco;
	}
	System.out.println("  ");
	
	for (int i=0; i<decimal.length; i++) {
		System.out.println(decimal[i]);
	}
	
	System.out.println("  ");
	
	Arrays.sort(decimal);
		
	
	for (int i=0; i<decimal.length; i++) {
        System.out.print(decimal[i] + ", ");
    }
	}
	
}
