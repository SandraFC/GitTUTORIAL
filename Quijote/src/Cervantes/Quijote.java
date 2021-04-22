package Cervantes;
import java.io.IOException;

public class Quijote {
	public static void main(String[] args) throws IOException {
		
		OperacionesFicheros of1 =new OperacionesFicheros();
		
		System.out.println("   ");
		System.out.println("Escritura");
		System.out.println("   ");
		
		of1.Escribir1();
		
		System.out.println("   ");
		System.out.println("lectura");
		System.out.println("   ");
		
		of1.leer();
		
		System.out.println(" ");
		System.out.println("Escritura");
		System.out.println(" ");
		
		of1.Escribir2();
		
		
		System.out.println("  ");
		System.out.println("Lectura");
		System.out.println("  ");
		
		of1.leer2();
		
		
		
	}
}
