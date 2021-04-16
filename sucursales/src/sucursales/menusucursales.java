package sucursales;

import java.util.Arrays;
import java.util.Scanner;



public class menusucursales {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaString = new Scanner(System.in) ;
		Scanner entradaNumeros = new Scanner(System.in);
		
		String empleado =" ", apellidos=" ", apellido=" ", espacio=" ";
		int sucursal=0, numempleados=2, numapellido=0, menu=0; 
		boolean encontrado=false;
		
		 sucursales[] datos=new sucursales[numempleados];
		
		 
		 	for(int i=0; i<datos.length; i++){
		 	try {
			datos[i] = new sucursales(empleado, apellidos, sucursal);
			
			System.out.println("    ");
			System.out.println("Datos del empleado " + (i+1) + ":");	
			System.out.println("    ");
			System.out.println("Nombre empleado: ");
			empleado = entradaString.nextLine();
		    datos[i].setEmpleado(empleado);         
		    
		    System.out.println("    ");
		    System.out.println("Apellidos del empleado: ");
			apellidos = entradaString.nextLine();
		    datos[i].setApellidos(apellidos); 
		    
		    System.out.println("    ");
		    System.out.println("Numero de su sucursal: ");
			sucursal = entradaNumeros.nextInt();
		    datos[i].setSucursal(sucursal); 
		   
		    
		     System.out.println(empleado + ", " + apellidos + ", " +sucursal);
		     System.out.println("-----------");
		 	}catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      System.out.println("    ");
			      entradaNumeros.nextLine();
		    }
		 	}
		 
			
			
			do {
				try {
				System.out.println("    ");
				System.out.println("..::BIENVENIDO::..");
				System.out.println("    ");
				System.out.println("    ");

				System.out.println("MENU PRINCIPAL");
				System.out.println("1 - SALIR");
			    System.out.println("2 - EMPLEADO DA SUCURSAL");
			    System.out.println("3 - SUCURSAL DA NOMBRES DE EMPLEADOS");
			    System.out.println("4 - EMPLEADOS CON EL MISMO APELLIDO");
			    System.out.println("5 - NUMERO DE EMPLEADOS BANCO");
			    System.out.println("6 - LISTA EMPLEADOS ALFAB�TICAMENTE");
			  
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
						System.out.println("2 - EMPLEADO DA SUCURSAL");
						 System.out.println("    ");
						 
						 do {
						 System.out.println("Nombre del empleado: ");
					     empleado=entradaString.nextLine();
					    
					     for (int i=0; i<datos.length; i++) {
					    	 	
					    	 	if (empleado.equals(datos[i].getEmpleado())){
					    		 					    		 
					    		 System.out.println(empleado + " pertenece a la sucursal: " +  datos[i].getSucursal());
					    		 encontrado=false;
					    	 	}
							    	else if (encontrado=false){
							    		System.out.println(empleado + " no pertenece al banco");
							    		encontrado=false;
							    	}
					    	 
						     
					    	 
					    	 
					     }
					     
						 }while(encontrado=false);
						}catch (Exception e) {
						      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
						      System.out.println("    ");
						      entradaNumeros.nextLine();
					    }
							
					break;
					case 3: 
						try {
						 System.out.println("3 - SUCURSAL DA NOMBRES DE EMPLEADOS");
						 System.out.println("    ");
						 System.out.println("sucursal del empleado: ");
					     sucursal=entradaNumeros.nextInt();
					    
					     for (int i=0; i<datos.length; i++) {
					    	 	
					    	 	if (sucursal==datos[i].getSucursal()){
					    		 					    		 
					    		 System.out.println("la sucursal " + datos[i].getSucursal() + " tiene el empleado: " + datos[i].getEmpleado());
					    		 encontrado=true;
					    	 	}
							    	else if (i==datos.length){
							    		System.out.println(empleado + " no pertenece al banco");
							    	}
					    	 
						
					     }
						}catch (Exception e) {
						      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
						      System.out.println("    ");
						      entradaNumeros.nextLine();
					    }
						 break;
					case 4: 
						try {
						System.out.println("4 - EMPLEADOS CON EL MISMO APELLIDO");
					
						System.out.println("    ");
						
						
						System.out.println("Primer apellido: ");
					    apellido=entradaString.nextLine();
					    
				
						for (int i = 0; i<datos.length; i++) {
							 
						

							if (apellido.equals(apellido.substring(datos[i].getApellidos().indexOf(espacio)+1,datos[i].getApellidos().length()))){	 	
						    
						    	datos[i].setSucursal(sucursal); 
						    	++numapellido;
						    	
						    	
								}
								    else if (i==datos.length){
								    	System.out.println("No hay empleados con el apellido " + apellido);
								    	}
						     
						}
						
						System.out.println("en el banco hay " + numapellido + " con el apellido " + apellido);
					    
						}catch (Exception e) {
						      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
						      System.out.println("    ");
						      entradaNumeros.nextLine();
					    }
					break;
					case 5: 
						System.out.println("5 - NUMERO DE EMPLEADOS BANCO");
						System.out.println(numempleados+1);
					break;
					case 6: 
						try {
						String nombres[]=new String[numempleados];
						
						for (int i=0; i<nombres.length; i++){
					
							nombres[i]=datos[i].getEmpleado();
						}
						
						
						System.out.println("6 - LISTA EMPLEADOS ALFABATICAMENTE");
						
						
						Arrays.sort(nombres);
						
						
						for (int i=0; i < datos.length; i++) {
							
					        System.out.println(datos[i].getEmpleado());
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
				}catch (Exception e) {
				      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
				      System.out.println("    ");
				      entradaNumeros.nextLine();
			    }
			}while(menu!=1);
		
		
		
		}
	
}



