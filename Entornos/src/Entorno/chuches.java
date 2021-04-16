package Entorno;


import java.io.IOException;
import java.util.Scanner;



public class chuches {
	
	
	static int bolsas;
	int chocolates;
	double euros;
	String cliente;
	
	public chuches (int bolsas, int chocolates, double euros, String cliente){
		this.bolsas=bolsas;
		this.chocolates=chocolates;
		this.euros=euros;
		this.cliente=cliente;
	}
	
	public chuches () {
		bolsas= 34;
		chocolates =100;
		euros = 601.32;
		cliente = "Patricia";
	}

	
	public int paquetes() {
		int paquetes=30;
		paquetes=chocolates/20;
		
		return paquetes;
	}
	
	public int cajas() {
		int cajas = 10;
		cajas=bolsas/10;
		return cajas;
		}
	
	public int pesetas() {
		double pesetas = 166.386; 
		pesetas=euros*pesetas;
		return (int) pesetas;
		}
	
	
	
	
	
	
	public int getBolsas() {
		return bolsas;
	}

	public void setBolsas(int bolsas) {
		this.bolsas = bolsas;
	}

	public int getChocolates() {
		return chocolates;
	}

	public void setChocolates(int chocolates) {
		this.chocolates = chocolates;
	}

	public double getEuros() {
		return euros;
	}

	public void setEuros(double euros) {
		this.euros = euros;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
		

public static void main (String[] args) throws IOException{
	
	 Scanner entradaEscaner = new Scanner(System.in);
		
	 int menu = 0, chuches=0, chocolates = 0,gominolas=0;
	 double euros=0, pesetas=0;
	 String cliente= " ";
	 
	 do {
			try {
				System.out.println("    ");
				System.out.println("..::Bienvenido::..");
				System.out.println("    ");
		
				
				System.out.println("    ");

				
				System.out.println("1 - Cantidad paquetes");
				System.out.println("2 - Cantidad cajas");
				System.out.println("3 - Euros a pesetas");
				System.out.println("4 - Nombre cliente");
				System.out.println("5 - SALIR");
				System.out.println("    ");
				System.out.println("Elige una opcion: ");
				System.out.println("    ");
				menu = entradaEscaner.nextInt();
				
				chuches o1 =new chuches();
				
				switch(menu){
				case 1: 
					System.out.println("1 - Cantidad paquetes");
					System.out.println("Unidades paquetes: " + o1.paquetes());   
				
				break;
			
				case 2: 
					
					System.out.println("    ");
					System.out.println("2 - Cantidad cajas");
					System.out.println("Unidades cajas: " + o1.cajas());     
				break;
				
				case 3: 
					
					System.out.println("    ");
					System.out.println("3 - Euros a pesetas");
					
					
					System.out.println("euros: " + o1.getEuros());  
					System.out.println("pesetas: " + o1.pesetas()); 
				
				break;
				
				case 4: 
					chuches o2=new chuches();
					System.out.println("    ");
					System.out.println("4 - Nombre cliente");
					System.out.println("    ");
					o2.setCliente("Marta");
					System.out.println("El nombre del cliente es: " + o2.getCliente());

				case 5: 
					System.out.println("    ");
					System.out.println("5 - SAlIR");
					
					
				break;
				
				default:
					System.out.println("OPCIÓN NO VALIDA. INTENTELO DE NUEVO");
				}
				
				
			} catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      System.out.println("    ");
			      entradaEscaner.nextLine();
		    }
		}while(menu!=5);
			}

	
		

}

