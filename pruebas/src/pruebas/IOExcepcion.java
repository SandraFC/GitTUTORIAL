package pruebas;

import java.io.*;
import java.util.Scanner; 

public class IOExcepcion{
public static void main(String [] args) throws IOException {
	
	char a= '=';
			
	Scanner entrada= new Scanner(System.in);
	
	do{ 
		System.out.println(" dime  un simbolito: ");
	a= (char)System.in.read();
	
	System.out.println("eso es lo correcto "+ a);
	
	}while (a!='?');
	
	
	
	
}
}
