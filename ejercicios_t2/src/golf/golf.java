package golf;

import java.util.Scanner;

import Restaurante.almacen;
import Tienda.tienda;

public class golf {
	int pelotas;
	int palos;
	int carritos;
	
	public golf (int Pelotas, int Palos, int Carritos) {
		pelotas=Pelotas;
		palos=Palos;
		carritos=Carritos;
	}

	public int getPelotas() {
		return pelotas;
	}

	public void setPelotas(int pelotas) {
		this.pelotas = this.pelotas + pelotas;
	}

	public int getPalos() {
		return palos;
	}

	public void setPalos(int palos) {
		this.palos =this.palos + palos;
	}

	public int getCarritos() {
		return carritos;
	}

	public void setCarritos(int carritos) {
		this.carritos =this.carritos + carritos;
	}
	
public static void main (String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in) ;
		
		int menu = 0, pelotas=0, palos= 0, carritos=0;

		
		golf objeto =new golf(pelotas, palos, carritos);
		
		
			do {
				try {
					System.out.println("..::Bienvenido::..");
					System.out.println("    ");
			
					
					System.out.println("    ");

					
					System.out.println("1 - Devolver pelotas");
					System.out.println("2 - Devolver palos");
					System.out.println("3 - Devolver carritos");
					System.out.println("4 - Alquilar pelotas");
					System.out.println("5 - Alquilar palos");
					System.out.println("6 - Alquilar carrito");
					System.out.println("7 - Comprobar stock General");
					System.out.println("8 - SALIR");
					System.out.println("    ");
					System.out.println("Elige una opcion: ");
					System.out.println("    ");
					menu = entradaEscaner.nextInt();
					
				
					switch(menu){
						case 1: 
							System.out.println("1 - Devolver pelotas");
							System.out.println("    ");
							System.out.println("Pelotas a añadir: ");
							pelotas = entradaEscaner.nextInt();
					
							objeto.setPelotas(pelotas);  //nombrar objeto y el set que a�ade informacion (papas es lo que a�ades)
						
							System.out.println("PELOTAS totales: " + objeto.getPelotas());  
						break;
						
						case 2: 
							System.out.println("2 - Devolver palos");
							System.out.println("    ");
							System.out.println("Palos a añadir: ");
							pelotas = entradaEscaner.nextInt();
					
							objeto.setPalos(palos);  //nombrar objeto y el set que a�ade informacion (papas es lo que a�ades)
						
							System.out.println("PALOS totales: " + objeto.getPalos());  
						break;
						
						case 3: 
							System.out.println("3 - Devolver carritos");
							System.out.println("    ");
							System.out.println("Carritos a añadir: ");
							pelotas = entradaEscaner.nextInt();
					
							objeto.setCarritos(carritos);  //nombrar objeto y el set que a�ade informacion (papas es lo que a�ades)
						
							System.out.println("CARRITOS totales: " + objeto.getCarritos());  
						break;
						
						case 4: 
							System.out.println("4 - Alquilar Pelotas");
							System.out.println("    ");
							System.out.println("Pelotas a alquilar: ");
							pelotas = entradaEscaner.nextInt();
							pelotas= -pelotas;
							
							objeto.setPelotas(pelotas);
							System.out.println("Aplicar oferta: por 10 pelotas + 1 pelota gratis");
							System.out.println("pelotas gratis: ");
							System.out.println("    ");
							System.out.println("Stock pelotas: " + objeto.getPelotas());  
							
						break;
						case 5: 
							System.out.println("5 - Alquilar Palos");
							System.out.println("    ");
							System.out.println("Palos a alquilar: ");
							palos = entradaEscaner.nextInt();
							palos= -palos;
							
							objeto.setPalos(palos);
							
							System.out.println("Aplicar oferta: por 1 palo + 1 pelota gratis");
							System.out.println("pelotas gratis: ");
							System.out.println("    ");
							System.out.println("Stock palos: " + objeto.getPalos()); 
							System.out.println("Stock pelotas: " + objeto.getPelotas());
							
						break;
						case 6: 
							System.out.println("6 - Alquilar Carritos");
							System.out.println("    ");
							System.out.println("Carritos a alquilar: ");
							carritos = entradaEscaner.nextInt();
							carritos= -carritos;
							
							objeto.setPelotas(carritos);
							
							System.out.println("Carritos totales: " + objeto.getPelotas());  
							
						break;
						case 7: 
							System.out.println("7 - Comprobar Stock general");
							System.out.println("    ");
							System.out.println("Stock palos: " + objeto.getPalos()); 
							System.out.println("Stock pelotas: " + objeto.getPelotas());
							System.out.println("Stock carritos: " + objeto.getCarritos());
						
						break;
						case 8: 
							System.out.println("8 - SALIR");
						break;
						
						default:
							System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
					}
			
					
					
			
				
					
				} catch (Exception e) {
				      System.out.println("Debe introducir solo numeros. Intentelo de nuevo");
				      System.out.println("    ");
				      entradaEscaner.nextLine();
			    }
				}while(menu!=8);
		
}
	
}
