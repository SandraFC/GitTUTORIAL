package tema7;
import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		
	Scanner entradaEscaner = new Scanner(System.in);
	
	
	
	String[][] matriz= new String[2][3];
	
	for (int i=0; i < matriz.length; i++) {
		  for (int j=0; j < matriz[i].length; j++) {
		    System.out.println("Introduzca el nombre [" + i + "," + j + "]");
		    matriz[i][j] = entradaEscaner.nextLine();
		  }
		}
	
	System.out.println("  ");
	System.out.println("La matriz seria:");
	System.out.println("  ");
	
	for (int i=0; i < matriz.length; i++) {
        for (int j=0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j]+"\t");
        }
        System.out.println("  ");
    }
	
	
	}
	
	

}
