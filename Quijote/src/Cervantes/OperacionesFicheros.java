package Cervantes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OperacionesFicheros {

	public void OperacionesFicheros() {
		
		//enlace de mac
		String elQuijote ="/Users/sandruski/Desktop/Eclipse/Quijote.txt";
	    char letra =' '; 
	    
		String contenido = "Hija por que cierras los ojos? \r\nPorque Windows me ha preguntado si quiero cerrar todas las pestañas";
		FileWriter elQuijote1 = null;
	    
	    
        try {
        	
    		
            elQuijote1 = new FileWriter(elQuijote);
     
            
	       //Escribimos tantos caracteres como haya en linea
  	      //Escribimos tantas líneas como vueltas da el bucle
            for (int i = 0; i < contenido.length(); i++){
                elQuijote1.write(contenido.charAt(i));
                
                if (contenido.charAt(i) == '.' || contenido.charAt(i) == ';'|| contenido.charAt(i) == ';') {
                	System.out.print("\r\n");
                }
                
                
            }

            
            //Cerramos el fichero
            elQuijote1.close();

        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        FileReader elQuijote2 = null;
        try {
            //Abrir el fichero indicado en la variable nombreFichero
        	elQuijote2 = new FileReader(elQuijote);
            //Leer el primer carácter
            //Se debe almacenar en una variable de tipo int
            int caract = elQuijote2.read();
            //Se recorre el fichero hasta encontrar el carácter -1
            //   que marca el final del fichero
            while(caract != -1) {
                //Mostrar en pantalla el carácter leído convertido a char
                System.out.print((char)caract);
                caract = elQuijote2.read(); //Leer el siguiente carácter

            }
            elQuijote2.close(); //cerramos el fichero
       
        }catch (FileNotFoundException e) {
                //Operaciones en caso de no encontrar el fichero
                System.out.println("Error: Fichero no encontrado");
                System.out.println(e.getMessage());//Mostrar el error

        }

        
        

	}
	
}
