package mininumero;

import java.util.Scanner;

public class minumero {
	
	int numero;
	

	public minumero(int Numero) {
		numero = Numero;
	}
	
	public int doble() {
		int doble= numero*2;
		return doble;
		}
	public int triple() {
		int triple= numero*3;
		return triple;
		}
	public int cuadruple() {
		int cuadruple= numero*4;
		return cuadruple;
	}
	
	public static void main (String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		
		int menu=0, numero=0, doble=0, triple=0, cuadruple =0;
		
		do {
		try {
			System.out.println("..::Bienvenido::..");
			System.out.println("    ");
			System.out.println("Introduzca un numero: ");
			numero = entradaEscaner.nextInt();
			
			System.out.println("    ");

			System.out.println("1 - SALIR");
			System.out.println("2 - Calcular el doble");
			System.out.println("3 - Calcular el triple");
			System.out.println("4 - Calcular el cuadruple");
			System.out.println("    ");
			System.out.println("Elige una opción: ");
			System.out.println("    ");
			menu = entradaEscaner.nextInt();
			
			
				switch (menu) {
					case 1:
						System.out.println("ha elegido: SALIR");
						System.out.println("Que tenga un buen dia");
					break;
					
					case 2:
						System.out.println("ha elegido calcular el DOBLE");
						minumero t1 =new minumero(numero);
						
						doble=t1.doble();
						System.out.println("El DOBLE de " + numero + " es: " + doble);
					
					break;
					
					case 3:
						System.out.println("ha elegido calcular el TRIPLE");
						minumero t2 =new minumero(numero);
						
						triple=t2.triple();
						System.out.println("El TRIPLE de " + numero + " es: " + triple);
						
					break;
					
					case 4:
						System.out.println("ha elegido calcular el CUADRUPLE");
						minumero t3 =new minumero(numero);
						
						cuadruple=t3.cuadruple();
						System.out.println("El CUADRUPLE de " + numero + " es: " + cuadruple);
						
					break;
					
					default:
						System.out.println("TIENE QUE SER UN NÚMERO DEL 1 AL 4");
						System.out.println("INTENTELO DE NUEVO");
			
					
				}
				
	
		} catch (Exception e) {
		      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
		      entradaEscaner.nextLine();
	    }
		}while(menu!=1);
		
		
	}
}