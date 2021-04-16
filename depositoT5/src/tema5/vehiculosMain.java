package tema5;

import java.util.Scanner;


import java.util.Arrays;

public class vehiculosMain {
	
	public static void main(String[] args) {
		Scanner entradaString = new Scanner(System.in) ;
		Scanner entradaNumeros = new Scanner(System.in);
		
		int menu = 0, numvehiculos=2, nummatriculas=0, matriculanum=0, dniNumeros=0;
		boolean correcto=false;
		
		String dni=" ", dniConletra;
		String matricula = " ", matriculanumeros=" ", matriculaLetra1=" ", matriculaLetra2=" ",matriculaentera=" ", matriculaletras=" ";
		String diasemana= " ";
		
		vehiculo[] coches=new vehiculo[numvehiculos];
		
		do {
			try {
			System.out.println("    ");
			System.out.println("..::BIENVENIDO::..");
			System.out.println("    ");
			System.out.println("    ");

			System.out.println("MENU PRINCIPAL");
			System.out.println("1 - SALIR");
		    System.out.println("2 - INTRODUCIR DATOS DE COCHES");
		    System.out.println("3 - NUMERO DE COCHES EN DEPOSITO");
		    System.out.println("4 - VEHICULOS EN DEPOSITO EN UN DIA CONCRETO");
		    System.out.println("5 - NUMERO DE MATRICULAS QUE EMPIEZAN POR UNA LETRA");
		  
		    System.out.println("    ");
			System.out.println("ELIJA UNA OPCION: ");
			menu = entradaNumeros.nextInt();
			System.out.println("    ");
			
			switch (menu){
			case 1: 
				System.out.println("1 - SALIR");
				System.out.println("Pase un buen dia");
			break;
			
			
			case 2: 
				System.out.println("2 - INTRODUCIR DATOS DE COCHES");
				System.out.println("   ");
				System.out.println("Numero de vehiculos: ");
				//el programa no coge el dato y he puesto 2 por defecto para ir rapido
				numvehiculos = entradaNumeros.nextInt();
				
				
				for(int i=0; i<coches.length; i++){
				 	
					try {
					
					coches[i] = new vehiculo(matricula, dni, diasemana);
					do {
						try {
							correcto=false;
							System.out.println("    ");
							System.out.println("matricula del coche (nnnnLLL) " + (i+1) + ":");
							matricula = entradaString.nextLine();
							matricula.trim();
	
							matriculanumeros = matricula.substring(0, 4);
							matriculaletras = matricula.substring(4, 7).toUpperCase();
							matriculaentera = matriculanumeros+matriculaletras;
							matriculanum = Integer.parseInt(matriculanumeros);
					
							correcto=true;
					
						}catch (Exception e) {
						      System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
						      System.out.println("    ");
						      entradaNumeros.nextLine();
						}
					 	
					}while (correcto!=true);
					
					coches[i].setMatricula(matriculaentera);  
					
					
					
					do {
						try {
							correcto=false;
							System.out.println("    ");
							System.out.println("DNI (sin letra): ");
							dniConletra = entradaString.nextLine();
							dni = dniConletra.trim().substring(0, 8);
							dniNumeros= Integer.parseInt(dni);

							correcto=true;
					
						}catch (Exception e) {
					      System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
					      System.out.println("    ");
					      entradaNumeros.nextLine();
						}
				 	
					}while (correcto!=true);
				    coches[i].setDni(dni); 
				    
				    System.out.println("    ");
				    System.out.println("Dia de la semana: ");
				    diasemana = entradaString.nextLine();
				    diasemana.trim();
				    coches[i].setDiasemana(diasemana); 
				   
				    
				     System.out.println(matricula + ", " + dni + ", " + diasemana);
				     System.out.println("-----------");
					
				
				}catch (Exception e) {
					      System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
					      System.out.println("    ");
					      entradaNumeros.nextLine();
				    
				 	}
				}
				 
			break;
			
			
			case 3: 
				
				System.out.println("3 - NUMERO DE COCHES EN DEPOSITO");
				System.out.println(coches.length);
				
			break;
			
			
			case 4: 
				try {
					System.out.println("4 - VEHICULOS EN DEPOSITO EN UN DIA CONCRETO");
					System.out.println("    ");
					System.out.println("Día de la semana: ");
					diasemana = entradaString.nextLine();
					diasemana.trim();
			    
					for (int i=0; i<coches.length; i++) {
			    	 	
			    	 	if (diasemana.equals(coches[i].getDiasemana())){
			    		 					    		 
			    		 System.out.println("El dia " + coches[i].getDiasemana() + " tiene el coche matricula: " + coches[i].getMatricula());
			    		
			    	 	}
					    	else if (i==coches.length){
					    		System.out.println("El dia " + diasemana + " no tiene ningún coche");
					    	}
			    	 
				
					}
				}catch (Exception e) {
				      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
				      System.out.println("    ");
				      entradaNumeros.nextLine();
			    }
				
				
			break;
			
			
			case 5: 
				try {
					System.out.println("5 - NUMERO DE MATRICULAS QUE EMPIEZAN POR UNA LETRA");
					System.out.println("Primera letra: ");
					matriculaLetra1=entradaString.nextLine();
				    
					for (int i = 0; i<coches.length; i++) {
						 
						matriculaLetra2=coches[i].getMatricula().substring(4, 5);
						matriculaLetra2.toUpperCase();

						if (matriculaLetra1.trim().equals(matriculaLetra2)){	 
					    	coches[i].setMatricula(matricula); 
					    	++nummatriculas;
					    	System.out.println(coches[i].getMatricula());
					    	
							}
							    else if (i==coches.length){
							    	System.out.println("No hay vehiculos con la letra " + matriculaLetra1);
							    	}
					     
					}
					
					System.out.println("En el deposito hay " + nummatriculas + " vehiculos con la primera letra " + matriculaLetra1);
				    
					}catch (Exception e) {
					      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
					      System.out.println("    ");
					      entradaNumeros.nextLine();
				    }
			break;
			
			default:
				System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
			
			}
			
			System.out.println(" ");
			System.out.println("¿quiere volver al menú principal?");
			System.out.println("1 - NO");
			System.out.println("2 - SI");
			System.out.println("Opción: ");
			menu = entradaNumeros.nextInt();
			
			
			}catch (Exception e) {
		      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
		      System.out.println("    ");
		      entradaNumeros.nextLine();
			}
			}while(menu!=1);


		
		
		
		
		
		
			
		
	}
	
}
