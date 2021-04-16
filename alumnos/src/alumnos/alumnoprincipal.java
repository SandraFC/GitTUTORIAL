package alumnos;

import java.io.IOException;
import java.util.Scanner;

public class alumnoprincipal {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String nombre = " ";
		String apellido =" ";
		int numalumnos = 28;
		double notaMedia= 4.75;
		
		
		
		System.out.println("Introduzca un nombre y apellido");
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Apellido: ");
		apellido = sc.nextLine();
		
		Alumno t1 = new Alumno();
		
		System.out.println("Nombre completo: " + nombre + " "+ apellido);
		System.out.println("    ");
		
		
		Alumno t2 =new Alumno(t1);
		
		System.out.println("Nombre completo: " + t2.getNombre() + " "+ t2.getApellido());
		System.out.println("   ");
		
		Alumno t3 =new Alumno();
		
		System.out.println("Nombre completo: " + t3.getNombre() + " "+ t3.getApellido());
		
		
		t3 = t1;
		
		System.out.println("   ");
		System.out.println("Nombre completo: " + t3.getNombre() + " "+ t3.getApellido());
		
		System.out.println("   ");
		System.out.println("Cambia el nombre que pusiste: ");
		nombre = sc.nextLine();
		
		t1.setNombre(nombre);
		
		System.out.println("Nombre completo: " + t1.getNombre() + " "+ t1.getApellido());
		System.out.println("   ");
		System.out.println("El nombre del primer objeto es: " + t2.getNombre());
		System.out.println("El nombre del segundo objeto es: "+ t1.getNombre());
		System.out.println("    ");
	
		
		if (t1.equals(t2)) {
			System.out.println("Los objetos son iguales");
		}
			else {
				System.out.println("Los objetos son diferentes");
			}

		Alumno t4 = new Alumno(numalumnos);
		
		t4.setNumalumnos();
		
		System.out.println("numero alumnos: " +t4.getNumalumnos());
	
		
		Alumno t5 = new Alumno(notaMedia);
		
		t5.incrementarNota();
		t5.setNumalumnos();
		System.out.println("la nota media es: " + t5.getNotaMedia());
		System.out.println("la nota media es: " + t5.resultadoNota());
	
		if (numalumnos==3) {
			System.out.println("Hay 3 alumnos");
		}
		else {
			System.out.println("No hay 3 alumnos");
			System.out.println("Los alumnos son: " + numalumnos);
		}
		
	}

}
