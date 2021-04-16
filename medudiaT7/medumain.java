package medudiaT7;

import java.util.Arrays;
import java.util.Scanner;

public class medumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaString = new Scanner(System.in) ;
		Scanner entradaNumeros = new Scanner(System.in);
		
		int menu = 0, numvehiculos=2, nummatriculas=0, matriculanum=0, dniNumeros=0;
		boolean correcto=false;
		int numerodias=7, comensales=0, sumacomensales=0;
		
		String dni=" ", dniConletra;
		String primero = " ", segundo=" ", postre=" ",diasemana=" ", matriculaletras=" ";
		
		menudiario[] menudia=new menudiario[numerodias=7];
		
		System.out.println("    ");
		System.out.println("..::BIENVENIDO::..");
		System.out.println("    ");
		
		
		for(int i=0; i<menudia.length; i++){
		 	
			try {
				menudia[i] = new menudiario(diasemana, primero, segundo, postre, comensales);

			
			
			
				try {
					
					 System.out.println("    ");
					 System.out.println("Dia de la semana: ");
					 diasemana = entradaString.nextLine();
					 diasemana.trim();
					 menudia[i].setDiasemana(diasemana);
					
					   
					 System.out.println("    ");
					 System.out.println("Primer plato: ");
					 primero = entradaString.nextLine();
					 primero.trim();
					 menudia[i].setPrimero(primero);
					 
					 System.out.println("    ");
					 System.out.println("Segundo plato: ");
					 segundo = entradaString.nextLine();
					 segundo.trim();
					 menudia[i].setSegundo(segundo);;
					 
					 System.out.println("    ");
					 System.out.println("Postre: ");
					 postre = entradaString.nextLine();
					 postre.trim();
					 menudia[i].setPostre(postre);;
					 
					 System.out.println("    ");
					 System.out.println("Comensales: ");
					 comensales = entradaNumeros.nextInt();	
					 menudia[i].setComensales(sumacomensales);
					 
					    
					  
				}catch (Exception e) {
			      System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
			      System.out.println("    ");
			      entradaNumeros.nextLine();
				}
		 	
		    
		     System.out.println(diasemana + ", " + dni);
		     System.out.println("El menu del dia es: " + primero + ", " + segundo + "  y " + postre);
		     System.out.println("Numero de comensales: " + comensales);
		     System.out.println("-----------");
			
		
			}catch (Exception e) {
			      System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
			      System.out.println("    ");
			      entradaNumeros.nextLine();
		
		    
		 	}
		
		 
		
		
		
		
		do {
			try {
			
			System.out.println("    ");

			System.out.println("MENU PRINCIPAL");
			System.out.println("1 - SALIR");
		    System.out.println("2 - DIA CON MAS COMENSALES");
		    System.out.println("3 - COMENSALES TOTALES A LA SEMANA");
		    System.out.println("4 - LISTA DE POSTRES SEMANALES");
		    System.out.println("5 - DAME EL DIA Y TE DOY SU MENU");
		  
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
				try {
				System.out.println("2 - DIA CON MAS COMENSALES");
				System.out.println("    ");
				int diamas[]=new int[numerodias];
				
				for (int b=0; b<diamas.length; b++){
			
					diamas[b]=menudia[b].getComensales();
				}
				
				
				Arrays.sort(diamas);
					
					
					for (int a=0; a<menudia.length; a++) {
			    	 	
			    	 	if (diamas[numerodias]==menudia[a].getComensales()){
			    		 					    		 
			    		 System.out.println("El dia con mas comensales es " + menudia[a].diasemana + " con: "+ menudia[a].getComensales());
			    		
			    	 	}
					    	else {
					    		System.out.println("No hay mas comensales");
					    	}
			    	 
					}
			}catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      System.out.println("    ");
			      entradaNumeros.nextLine();
		    }
			
			
				
			break;
			case 3: 
				try{
				System.out.println("3 - COMENSALES TOTALES A LA SEMANA");
				
				for (int b=0; b<menudia.length; b++){
					
					sumacomensales=sumacomensales + menudia[b].getComensales();
				}
				
				System.out.println("En la semana ha habido: "+ sumacomensales + " comensales");
			
				}catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      System.out.println("    ");
			      entradaNumeros.nextLine();
		    }
			break;
			case 4: 
				try {
				System.out.println("4 - LISTA DE POSTRES SEMANALES");
				
				
				
					String postrecitos[]=new String[numerodias];
					
					for (int b=0; b<postrecitos.length; b++){
				
						postrecitos[b]=menudia[b].getPostre();
					}
					
					
					Arrays.sort(postrecitos);
					
					
					for (int c=0; c < postrecitos.length; i++) {
						
				        System.out.println(menudia[c].getPostre());
				    }
					
				}catch (Exception e) {
				      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
				      System.out.println("    ");
				      entradaNumeros.nextLine();
			    }
				
				
				
			break;
			case 5: 
				try {
				System.out.println("5 - DAME EL DIA Y TE DOY SU MENU");
					System.out.println("    ");
					System.out.println("d�a de la semana: ");
					diasemana = entradaString.nextLine();
					diasemana.trim();
					
					for (int s=0; s<menudia.length; s++) {
			    	 	
			    	 	if (diasemana.equals(menudia[s].getDiasemana())){
			    		 					    		 
			    		 System.out.println("El dia " + menudia[s].getDiasemana() + " Hay de menu: : " + menudia[s].getPrimero() + ", " + menudia[s].getSegundo() + " y " + menudia[s].getPostre());
			    		
			    	 	}
					    	else {
					    		System.out.println("Este dia no hay menu");
					    	}
			    	 
				
					}
					
				
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

}}
