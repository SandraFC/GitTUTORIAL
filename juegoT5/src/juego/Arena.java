package juego;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Arena {
	Scanner entradaNumeros = new Scanner(System.in);
	Scanner entradaString = new Scanner(System.in);

	public void lucha(guerrero g1, mago m1, int danoValor, Integer danoReferencia) {
		int lucha;
		int movimientoMago=m1.movimentoLucha();
		int movimientoGuerrero = g1.movimientoLucha();
	
		
		g1.setVida(m1.getVida()-(movimientoMago));
		
		m1.setVida(g1.getVida()-(movimientoGuerrero));
		
		System.out.println("   ");
		System.out.println("Vida que le resta al guerrero es: " + movimientoGuerrero);
		System.out.println("Vida que le resta al mago es: " + movimientoMago);
		System.out.println("   ");
		
		danoValor=movimientoMago+movimientoGuerrero;
		System.out.println("danoValor es: " + danoValor);
		danoReferencia=movimientoMago+movimientoGuerrero;
		System.out.println("danoReferencia es: " + danoReferencia);
		return;
	}	
	
	public void lucha(guerrero g1, mago m1, int danoValor, Integer danoReferencia, GuerreroFuerte gf1) {
		int movimientoGuerreroFuerte=gf1.movimientoLucha();
		int lucha;
		int movimientoMago=m1.movimentoLucha();
		int movimientoGuerrero = g1.movimientoLucha();
		int movimientoGFuerte = gf1.movimientoLucha();
		int menu=0;
		
		
		try {
			
			System.out.println(" ");
			System.out.println("SIGAMOS JUGANDO");
			System.out.println("  ");
			
			System.out.println("1 - LUCHA MAGO vs GUERRERO");
			System.out.println("2 - LUCHA MAGO vs GUERREROFUERTE");
		  
			
				
			System.out.println("    ");
			System.out.println("ELIJA UNA OPCION: ");
			menu = entradaNumeros.nextInt();
			System.out.println("    ");
		
			switch (menu){
			case 1: 
			System.out.println("LUCHA MAGO vs GUERRERO");
			
			//las vidas no funcionan bien 
			
			do{	
		
				
				System.out.println("Ataque: " + movimientoGuerrero);
				g1.setVida(m1.getVida()-(movimientoMago));
				
				
				System.out.println("Ataque: " + movimientoMago);
				m1.setVida(g1.getVida()-(movimientoGuerrero));
				
				
				System.out.println(" ");
				System.out.println("Vida del GUERRERO: " + g1.getVida());
				System.out.println("Vida del MAGO: " + m1.getVida());
				
				
				if(m1.getVida()==0) {
					System.out.println("Mago sin vidas");
				}
				
				else if (g1.getVida()==0){
					System.out.println("Guerrero sin vidas");
				}
				else {
					System.out.println("Sigue la partida");
				}
				
			}while (m1.getVida()!=0 || g1.getVida()!=0);
			
			break;
			
			case 2: 
			System.out.println("LUCHA MAGO vs GUERREROFUERTE");
			
			do{
				
				System.out.println("Ataque: " + movimientoGFuerte);
				g1.setVida(m1.getVida()-(movimientoMago));
				
				
				System.out.println("Ataque: " + movimientoMago);
				m1.setVida(g1.getVida()-(movimientoGFuerte));
				
				
				System.out.println(" ");
				System.out.println("Vida del GUERRERO: " + g1.getVida());
				System.out.println("Vida del MAGO: " + m1.getVida());
				
				
				
				if(m1.getVida()==0) {
					System.out.println("Mago sin vidas");
				}
				
				else if (gf1.getVida()==0){
					System.out.println("GuerreroFuerte sin vidas");
				}
				else {
					System.out.println("Sigue la partida");
				}
			} while (m1.getVida()!=0 || gf1.getVida()!=0);
			
			break;
		
			default:
			System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
			}
		}catch (Exception e) {
	      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
	      System.out.println("    ");
	      entradaNumeros.nextLine();
		}
		
		
		
		
		return;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int guerrero;
		int magia;
		int lucha = 0;
		int danoValor = 0;
		Integer danoReferencia = 0;
		int menu=0;
		int vida =0;
		
		Arena a1 = new Arena();
		final guerrero g1 = new guerrero();
		GuerreroFuerte gf1 = new GuerreroFuerte();
	
		
		
		System.out.println("Vida del GUERRERO: " + g1.getVida());
		System.out.println("Ataque: " + g1.movimentoLucha(danoReferencia));
		
		final mago m1 = new mago();
		System.out.println("Vida del  MAGO: " + g1.getVida());
		System.out.println("Ataque: " + m1.movimentoLucha());
	
	
		System.out.println(" ");
		System.out.println("Vida del GUERRERO: " + g1.getVida());
		System.out.println("Vida del MAGO: " + m1.getVida());
		
		a1.lucha(g1, m1, danoReferencia, danoReferencia);
		
		System.out.println("Vida del GUERRERO: " + g1.getVida());
		System.out.println("Vida del MAGO: " + m1.getVida());
		
		a1.lucha(g1, m1, vida, vida, gf1);
		
		guerrero g2 = (guerrero) gf1;
		
		a1.lucha(g2, m1, danoValor, danoReferencia);
		
		
	}
	
	
}
