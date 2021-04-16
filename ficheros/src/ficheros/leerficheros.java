package ficheros;
import java.io.*;


public class leerficheros {
	
	public static void main(String[] args) throws IOException {
		//enlace en windows
		// String nombreFichero = "C:\\Users\\jorge\\Desktop\\ficheros\\buenas.txt"; 
		//enlace de mac
		String nombreFichero = "/Users/sandruski/Desktop/Eclipse/buenas.txt"; 
		

		int cantidadA =0;
		int cantidadE =0;
		int cantidadI =0;
		int cantidadO =0;
		int cantidadU =0;
		char letra =' ';
		
		FileWriter fichero1 = null;
      
		String contenido = "Hija por que cierras los ojos? \r\nPorque Windows me ha preguntado si quiero cerrar todas las pestañas";
        
        try {
        	
            fichero1 = new FileWriter(nombreFichero);
            
	       //Escribimos tantos caracteres como haya en linea
            for (int i = 0; i < contenido.length(); i++){
                //Escribimos el carácter leído en linea
                fichero1.write(contenido.charAt(i));
            }
            
            //Cerramos el fichero
            fichero1.close();

        } catch (IOException e) {
            e.printStackTrace();
        } 


		
		    //Declarar una variable FileReader
		    FileReader fichero2 = null;
		    
		    try {
		        //Abrir el fichero indicado en la variable nombreFichero
		        fichero2 = new FileReader(nombreFichero);
		        //Leer el primer car�cter
		        //Se debe almacenar en una variable de tipo int
		        int caracter = fichero2.read();
		        //Se recorre el fichero hasta encontrar el car�cter -1
		        //   que marca el final del fichero
		        while(caracter != -1) {
		            //Mostrar en pantalla el car�cter le�do convertido a char
		            System.out.print((char)caracter);
		           

		            
		        		
		    			letra =(char)caracter; //obtenemos el caracter de la posicion i
		    			
		    			//si el caracter es igual a "a" "e" "i" "o" "u" entonces es vocal
		    			
		    			if (letra == 'a' || letra == 'A') {
		    				cantidadA++; //contamos cantidad de A +1
		    			}
		    			else if (letra == 'e' || letra == 'E') {
		    				cantidadE++; //contamos cantidad de E +1
		    			}
		    			else if (letra == 'i' || letra == 'I') {
		    				cantidadI++; //contamos cantidad de I +1
		    			}
		    			else if (letra == 'o' || letra == 'O') {
		    				cantidadO++; //contamos cantidad de O +1
		    			}
		    			else if (letra == 'u' || letra == 'U') {
		    				cantidadU++; //contamos cantidad de U +1
		    			}
		    			 caracter = fichero2.read(); //Leer el siguiente car�cter
		    		}
		    	
		            
		        
		    	//mostramos por pantalla cantidad de vocales
		        System.out.println(" ");
		        System.out.println(" ");

	    		System.out.println("La cantidad de A es: " + cantidadA);
	    		System.out.println("La cantidad de E es: " + cantidadE);
	    		System.out.println("La cantidad de I es: " + cantidadI);
	    		System.out.println("La cantidad de O es: " + cantidadO);		            
	    		System.out.println("La cantidad de U es: " + cantidadU);
		        fichero2.close(); //cerramos el fichero
		    }
		    catch (FileNotFoundException e) {
		        //Operaciones en caso de no encontrar el fichero
		        System.out.println("Error: Fichero no encontrado");
		        System.out.println(e.getMessage());//Mostrar el error
		    }

	}
}
