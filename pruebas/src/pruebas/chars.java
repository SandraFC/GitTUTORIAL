package pruebas;

import java.io.*;
import java.util.Scanner;

public class chars {
	
	
	public static void main(String [] args) throws IOException {
		// TODO Auto-generated method stub

		char operador = '=';
		int a =0, b=0, resultado;
		Scanner entrada= new Scanner(System.in);
		
	System.out.println("escribe un numero: ");
	a =entrada.nextInt();
	
	System.out.println("Escribe un signo / + * -: "); 
	operador= (char)System.in.read();
	
	System.out.println("Escribe otro número: ");
	b =entrada.nextInt();
	
		switch (operador) {
		case '+': 
			resultado=a+b;
			System.out.println("El resultado es: " + a + " + " + b + " es " + resultado);
			break;
			
		case '-':
			resultado=a-b;
			System.out.println("El resultado es: " + resultado);
			break;
		case '/':
			resultado=a/b;
			System.out.println("El resultado es: " + resultado);
			break;
		case '*':
			resultado=a*b;
			System.out.println("El resultado es: " + resultado);
			break;
		default:
			System.out.println("El numero del operador no corresponde con ninguno de las lista");
			
		}
	
	
	
	;
		
	}

}
