package gitProyecto;
import java.io.IOException;
import java.util.Scanner;

public class frases {


	Scanner sc = new Scanner(System.in);

	
	String nombre = " ";
	String apellidos =" ";
	String apellido1 =" ";
	String apellido2 = " ";
	String n = " ";
	String a1 = " ";
	String a2 = " ";
	String ombre = " ";
	String pellido1 =" ";
	String pellido2 =" ";
	String nombrecompleto = " ";
	String espacioS = " ";

	
	
	System.out.println ("Escriba un nombre completo: ");
	nombrecompleto = sc.nextLine(); //leemos la cadena
	
	String palabras[] = nombre.split(" ");
	
	for (int i=0; i<palabras.length;i++) {
		System.out.println(palabras[i]);
	}
	

	nombre = nombrecompleto.substring(0, nombrecompleto.indexOf(espacio));
	apellidos = nombrecompleto.substring(nombrecompleto.indexOf(espacio)+1,nombrecompleto.length());
	System.out.println ("  ");
	

	System.out.println ("Apellidos y nombre");
	
	n = nombre.substring(0,1);
	ombre = nombre.substring(1);
	
	apellido1 = apellidos.substring(0, apellidos.indexOf(espacio));
	
	a1 = apellido1.substring(0,1);
	pellido1 = apellido1.substring(1);
	
	
	apellido2 = apellidos.substring(apellidos.indexOf(espacio)+1,apellidos.length());
	
	a2 = apellido2.substring(0,1);
	pellido2 = apellido2.substring(1);
	
	
	
	System.out.println (a1.toUpperCase() + pellido1 + " "  + a2.toUpperCase() +  pellido2 + ", " + n.toUpperCase() + ombre);
	
	
	

	
	
	
}	
}
