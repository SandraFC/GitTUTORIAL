package tema7;

import java.util.Arrays;
import java.util.Scanner;

public class listaalumnos {
public static void main(String[] args) {
		
	Scanner entradaEscaner = new Scanner(System.in);
	int menu=0, numero=10;
	String alumno =" ", nombre=" ";
	 
	String[] lista= new String[numero];
	
	System.out.println("    ");
	System.out.println("..::Bienvenido::..");
	System.out.println("    ");

	
	System.out.println("    ");
	

	
	for (int i=0; i<numero; i++){
		System.out.println("nombre del alumno " + (i+1) + ": ");
		alumno = entradaEscaner.nextLine();
		
		lista[i]=alumno;
	}
		
		
		System.out.println(" ");
		System.out.println("OPCIONES");
		System.out.println("1 - Alumnos que empiezan por A");
		System.out.println("2 - Dame un numero y te doy su nombre alumno");
		System.out.println("3 - dame un nombre y te doy su numero");
		System.out.println("4 - lista alfabeticamente");
		System.out.println("    ");
		System.out.println("Elige una opcion: ");
		System.out.println("    ");
		menu = entradaEscaner.nextInt();
		
		
		switch(menu){
			case 1:
				System.out.println("1 - Alumnos que empiezan por A");
				for (int i=0; i<numero; i++){
					if (lista[i].startsWith("A")) {
						System.out.println("El alumno : " + lista[i]);
					}
				}
				
				
			break;
		
			case 2:
				System.out.println("2 - Dame un numero y te doy su nombre alumno");
				System.out.println("    ");
				
				System.out.println("Numero de alumno: ");
				numero = entradaEscaner.nextInt();
				System.out.println("Nombre de alumno: " + lista[numero-1]);
				
			break;
			
			case 3:
				System.out.println("3 - Dame un nombre y te doy su numero");
				
				System.out.println("Nombre de alumno: ");
				nombre= entradaEscaner.nextLine();
				
				 for (int i = 0;  i== lista.length; i++) {
					    if (lista[i] == nombre) {
					    	System.out.println(nombre + " es el numero: "+ (i+1));
					    }
					    	else if (i==lista.length){
					    		System.out.println(nombre + " no es ningún alumno");
					    	}
				 }
					System.out.println("Numero de alumno: " + numero);
					break;
						
						
					case 4:
						System.out.println("4 - lista alfabeticamente");
						Arrays.sort(lista);
						
						
						for (int i=0; i < lista.length; i++) {
					        
					        System.out.println(lista[i] + ", ");
					    }
						
						
					break;
					
					default:
					System.out.println("OPCIÓN NO VALIDA. INTENTELO DE NUEVO");
					
					}	
		}
			

}

