//EL JAVADOC SE HA GENERADO DEL PAQUETE ENTERO

package Restaurante;

import java.util.Scanner;

/**
 * Autor y año: 
 * @author: Sandra Frias Cuervo
 * @version: 04/03/2021
 */

public class almacen {

	int papas;  //atributos de la clase almacen
	int chocos;
	

	public almacen(int Chocos, int Papas) {   //constructores
		chocos=Chocos;
		papas= Papas;
		
		}
	/**
	 * @param getPapas recoge el numero entero de Papas
	 * @return devuelve el numero entero de Papas
	 */
	public int getPapas() {  //metodo que muestra informacion
		return papas;  
	}
	/**
	 * @param getChocos recoge el numero entero de Chocos
	 * @return devuelve el numero entero de Chocos
	 */
	public int getChocos() {
	return chocos;
	
	}
	/** 
	 * @param papas almacena el numero de Papas y suma las anteriores
	 */
	public void setPapas(int papas) {
		this.papas = this.papas + papas;
	}
	/**
	 * 
	 * @param chocos almacena el numero de Chocos y suma las anteriores
	 */
	public void setChocos(int chocos) {
		this.chocos = this.chocos + chocos;
		
	}
	
	/**
	 * @param clientes calcula el numero de clientes según el numero de chocos y papas 
	 * @return clientes devuelve el numero de clientes de la operación
	 * @see #getChocos() llamamos al getChocos para mostrar el valor
	 * @see #getPapas() llamamos al getPapas para mostrar el valor
	 */
	public int clientes() {
		int clientes, menor;
		if (chocos<papas) {
			menor=chocos;
		}
		else {menor=papas;}
		
		clientes=menor/4;
		
		return clientes;
		}
	

	/**
	 * 
	 * @param args Array args de String de la clase main (principal)
	 */
	public static void main (String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in);
		
		int menu = 0, papas=0, chocos= 0, clientes=0;
		
		almacen objeto =new almacen(chocos, papas);  // crear objeto = constructoralmacen
		                                             // esta fuera del bucle para que se a�ada informacion
		do {
			try {
				
				System.out.println("..::Bienvenido::..");
				System.out.println("    ");
		
				
				System.out.println("    ");

				
				System.out.println("1 - Kilos de Chocos disponibles");
				System.out.println("2 - Kilos del Papas disponibles");
				System.out.println("3 - A�adir kilos de Chocos");
				System.out.println("4 - A�adir kilos de Papas");
				System.out.println("5 - Merma de kilos de Chocos");
				System.out.println("6 - Merma de kilos de Papas");
				System.out.println("7 - Aforo a atender");
				System.out.println("8 - SALIR");
				System.out.println("    ");
				System.out.println("Elige una opcion: ");
				System.out.println("    ");
				menu = entradaEscaner.nextInt();
				
			
				switch(menu){
					case 1: 
						System.out.println("1 - Kilos de Chocos disponibles");
						System.out.println("Kg totales Chocos: " + objeto.getChocos());   //nombrar objeto creado y el  get que muestra lo que hay en  Chocos
						
					
					break;
				
					case 2: 
						System.out.println("2 - Kilos del Papas disponibles");
						System.out.println("Kg totales Papas: " + objeto.getPapas());      //nombrar objeto creado y el  get que muestra lo que hay en Papas
						
					break;
					
					case 3: 
						System.out.println("3 - A�adir kilos de Papas");
						System.out.println("    ");
						System.out.println("Kilos a a�adir: ");
						papas = entradaEscaner.nextInt();
					
						objeto.setPapas(papas);  //nombrar objeto y el set que a�ade informacion (papas es lo que a�ades)
						
						System.out.println("Kg Papas totales: " + objeto.getPapas());  
					break;
					
					case 4: 
						System.out.println("4 - A�adir kilos de Chocos");
						System.out.println("    ");
						System.out.println("Kilos a a�adir: ");
						chocos = entradaEscaner.nextInt();
						
						objeto.setChocos(chocos); //nombrar objeto y el set que a�ade informacion (chocos es lo que a�ades)
						
						System.out.println("Kg Chocos totales: " + objeto.getChocos()); 
					break;
					
					case 5: 
						System.out.println("5 - Merma de kilos de Papas");
						System.out.println("    ");
						System.out.println("Kilos a a�adir");
						papas = entradaEscaner.nextInt();
						papas= -papas;
						
						/**
						 * @see #setPapas() llamamos a setPapas() para recuperar el valor
						 */
						
						objeto.setPapas(papas);
						/**
						 * @see #getPapas() llamamos al getPapas para mostrar el valor
						 */
						System.out.println("Kg Papas totoales: " + objeto.getPapas());  
						
					break;
					
					case 6: 
						System.out.println("6 - Merma kilos de Chocos");
						System.out.println("    ");
						System.out.println("Kilos a a�adir");
						chocos = entradaEscaner.nextInt();
						
						/**
						 * @see #setChocos() llamamos a setChocos() para recuperar el valor
						 */
						
						objeto.setChocos(-chocos);
						/**
						 * @see #getChocos() llamamos al getChocos para mostrar el valor
						 */
						System.out.println("Kg Chocos totales: " + objeto.getChocos());
						
					break;
					
					case 7: 
						System.out.println("7 - Aforo a atender");
						
						/**
						 * @see #clientes() realiza la operación del método
						 */
					
						System.out.println(objeto.clientes() + " clientes");
						
						
						break;
						
					case 8: 
						System.out.println("8 - SALIR");
					break;
					
					default:
						System.out.println("OPCI�N NO VALIDA. INTENTELO DE NUEVO");
				}
		
				
				
		
			
			/**
			 * @throws Excepcion_e <ul>
			 * 							<li>Excepción general</li>
			 * 							<li>Excepción ante meter por pantalla letras en vez de números</li>
			 * 					   </ul>
			 */
			} catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      System.out.println("    ");
			      entradaEscaner.nextLine();
		    }
			}while(menu!=8);  //cierre del bucle del menu principal
	
	} //cierre de la clase principal
} //cierre de la clase
