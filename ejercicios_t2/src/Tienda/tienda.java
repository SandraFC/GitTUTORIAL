package Tienda;


import java.util.Scanner;

import Restaurante.almacen;

public class tienda {
	int camisas;
	int pantalones;

	public tienda (int Camisas, int Pantalones) {
		camisas=Camisas;
		pantalones=Pantalones;
	}

	public int getCamisas() {
		return camisas;
	}

	public int getPantalones() {
		return pantalones;
	}
	public void setCamisas(int camisas) {
		this.camisas = this.camisas + camisas;
	}

	public void setPantalones(int pantalones) {
		this.pantalones = this.pantalones + pantalones;
	}
	
	public int stockpantalones() {
		int stockpantalones=pantalones;
		if (pantalones<5) {
			System.out.println("Es necesario hacer un pedido de Pantalones");
			System.out.println("Stock pantalones:");
		}
		else if ((pantalones>=5)&&(pantalones<=10)) {
			System.out.println("Próximamente será necesario hacer un pedido de Pantalones");
			System.out.println("Stock pantalones:");
			}
		else if (pantalones>10){
			System.out.println("De momento no es necesario hacer pedido de Pantalones");
			System.out.println("Stock pantalones:");
		}
		return stockpantalones;
	}
	
	public int stockcamisas() {
		int stockcamisas=camisas;
		if (camisas<5) {
			System.out.println("Es necesario hacer un pedido de Camisas");
			System.out.println("Stock Camisas:");
		}
		else if ((camisas>=5)&&(camisas<=10)) {
			System.out.println("Próximamente será necesario hacer un pedido de Camisas");
			System.out.println("Stock Camisas:");
			}
		else if (camisas>10){
			System.out.println("De momento no es necesario hacer pedido de Camisas");
			System.out.println("Stock Camisas:");
			}
		return stockcamisas;
	}
	
	public static void main (String[] args) {
		
		Scanner entradaEscaner = new Scanner(System.in) ;
		
		int menu = 0, camisas=0, pantalones= 0, stockpantalones=0, stockcamisas=0;

		
		tienda objeto =new tienda(camisas, pantalones);  
		
		do {
	
			try {
				System.out.println("..::Bienvenido::..");
				System.out.println("    ");
		
				
				System.out.println("    ");

				
				System.out.println("1 - SALIR");
				System.out.println("2 - Añadir Camisas al almacen");
				System.out.println("3 - Añadir Pantalones al almacen");
				System.out.println("4 - Vender Camisa");
				System.out.println("5 - Vender Pantalon");
				System.out.println("6 - Comprobar stock Camisas");
				System.out.println("7 - Comprobar stock Pantalones");
				
				System.out.println("    ");
				System.out.println("Elige una opcion: ");
				System.out.println("    ");
				menu = entradaEscaner.nextInt();
				
				
				switch(menu){
			
					case 1: 
						System.out.println("1 - Ha elegido salir");

						System.out.println("     "); 
						System.out.println("Pase un buen día");
				
					break;
					case 2: 
						System.out.println("2 - Añadir Camisas al almacen");
						System.out.println("    ");
						System.out.println("Camisas a añadir: ");
						camisas = entradaEscaner.nextInt();
					
						objeto.setCamisas(camisas);  
						
						System.out.println("Total de Camisas: " + objeto.getCamisas());  
						System.out.println("    ");  
						System.out.println("¿Quiere volver al menú?");  
						System.out.println("1 - no"); 
						System.out.println("2 - si"); 
						menu = entradaEscaner.nextInt();
						
						
					break;
					
					case 3: 
						System.out.println("3 - Añadir Pantalones al almacen");
						System.out.println("    ");
						System.out.println("Pantalones a añadir: ");
						pantalones = entradaEscaner.nextInt();
					
						objeto.setPantalones(pantalones);  
						
						System.out.println("Total de camisas: " + objeto.getPantalones()); 
						
						
						System.out.println("    ");  
						System.out.println("¿Quiere volver al menú?");  
						System.out.println("1 - no"); 
						System.out.println("2 - si"); 
						menu = entradaEscaner.nextInt();
						
					break;
					case 4: 
						System.out.println("4 - Vender Camisa");
						System.out.println("    ");
						System.out.println("Camisas vendidas: ");
						camisas = entradaEscaner.nextInt();
			
						objeto.setCamisas(-camisas);
						
						System.out.println("Numero de camisas totales: " + objeto.getCamisas()); 

						System.out.println("    ");  
						System.out.println("¿Quiere volver al menú?");  
						System.out.println("1 - no"); 
						System.out.println("2 - si"); 
						menu = entradaEscaner.nextInt();
						
					break;
					case 5: 
						System.out.println("5 - Vender Pantalon");
						System.out.println("    ");
						System.out.println("Pantalones vendidos: ");
						pantalones = entradaEscaner.nextInt();
			
						objeto.setCamisas(-pantalones);
						
						System.out.println("Numero de pantalones totales: " + objeto.getPantalones()); 

						System.out.println("    ");  
						System.out.println("¿Quiere volver al menú?");  
						System.out.println("1 - no"); 
						System.out.println("2 - si"); 
						menu = entradaEscaner.nextInt();
						
					break;
					case 6: 
						System.out.println("6 - Comprobar stock Camisas");
						System.out.println("     "); 
						System.out.println(objeto.stockcamisas());
					

						System.out.println("    ");  
						System.out.println("¿Quiere volver al menú?");  
						System.out.println("1 - no"); 
						System.out.println("2 - si"); 
						menu = entradaEscaner.nextInt();
						
					break;
					case 7: 
						System.out.println("7 - Comprobar stock Pantalones");
	
						System.out.println("     "); 
						System.out.println(objeto.stockpantalones());
						

						System.out.println("    ");  
						System.out.println("¿Quiere volver al menú?");  
						System.out.println("1 - no"); 
						System.out.println("2 - si"); 
						menu = entradaEscaner.nextInt();
						
					default:
						System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
						
			}
			} catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      System.out.println("    ");
			      entradaEscaner.nextLine();
			    
		    }
			}while(menu!=1);
	}

}

