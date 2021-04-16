package pesos;

import java.util.Scanner;

import minumero.minumero;

public class pesos {

	double kilo;
	
	public pesos(double Kilo) {
		kilo = Kilo;
	}
	
	public double getkilo() {
	return kilo;
	}


	public void setKilo(double kilo) {
	this.kilo = kilo;
	}


	public void getpeso(int opcion) {
		switch (opcion) {
			case 1:
		
				double libra = getkilo()/0.425;
				System.out.println("El peso en libras es: " + libra);
				
			break;
			
			case 2:
				double lingote = getkilo()/14.59;
				System.out.println("El peso en lingotes es: " + lingote);
		
			break;
			
			case 3:
				double onza = getkilo()/0.02835;
				System.out.println("El peso en onzas es: " + onza);
				
			break;
			
			case 4:
				
				double penique = getkilo()/0.00155;
				System.out.println("El peso en peniques es: " + penique);
				
				
			break;

			case 5:
				double quintal = getkilo()/43.3;
				System.out.println("El peso en quintales es: " + quintal);
			
				
			break;
			
			case 6:
				
				System.out.println("Ha elegido SALIR");
			
				
			break;
			
			default:
				System.out.println("Opcion incorrecta");
		}
		
		
		}
	
public static void main (String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		
		double peso=0, kilo=0, numero=0, menu=0, libra=0, lingote=0, onza=0, penique=0, quintal=0;
		int opcion=0;
		
		do {
			try {
				System.out.println("..::Bienvenido::..");
				System.out.println("    ");
				System.out.println("Introduzca un numero: ");
				kilo = entradaEscaner.nextInt();
				
				System.out.println("    ");

			
				System.out.println("1 - Calcular el peso en Libras");
				System.out.println("2 - Calcular el peso en Lingotes");
				System.out.println("3 - Calcular el peso en Onzas");
				System.out.println("4 - Calcular el peso en Peniques");
				System.out.println("5 - Calcular el peso en Quintales");
				System.out.println("6 - SALIR");
				System.out.println("    ");
				System.out.println("Elige una opcion: ");
				System.out.println("    ");
				opcion = entradaEscaner.nextInt();
				
				pesos t1 =new pesos(kilo);
				
				
				
				t1.getpeso(opcion);
			
				
			} catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      entradaEscaner.nextLine();
		    }
			}while(opcion!=6);
	}

}
