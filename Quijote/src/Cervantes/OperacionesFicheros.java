package Cervantes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OperacionesFicheros {

	
	
	public void Escribir1() {
		
		//enlace de mac
		String elQuijote ="/Users/sandruski/Desktop/Eclipse/Quijote.txt";
	    char letra =' '; 
	    
		String contenido = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, los días de entre semana se honraba con su vellori de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años, era de complexión recia, seco de carnes, enjuto de rostro; gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada o Quesada (que en esto hay alguna diferencia en los autores que deste caso escriben), aunque por conjeturas verosímiles se deja entender que se llama Quijana; pero esto importa poco a nuestro cuento; basta que en la narración dél no se salga un punto de la verdad.";
		FileWriter elQuijote1 = null;
	    
	    
        try {
        	
            elQuijote1 = new FileWriter(elQuijote);
     
            
	       //Escribimos tantos caracteres como haya en linea
  	      //Escribimos tantas líneas como vueltas da el bucle
            for (int i = 0; i < contenido.length(); i++){
                elQuijote1.write(contenido.charAt(i));
               
            }

            //Cerramos el fichero
            elQuijote1.close();

        } catch (IOException e) {
            e.printStackTrace();
        } 
        
	}
	
	public void leer() {
		 FileReader elQuijote2 = null;
	        try {
	    		String elQuijote ="/Users/sandruski/Desktop/Eclipse/Quijote.txt";
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
	       
	        } catch (IOException e) {
	            e.printStackTrace();
	    		System.out.println("No se ha encontrado el fichero");



	        }
	}
	
	public void Escribir2 () {
		//enlace de mac
				String elQuijote ="/Users/sandruski/Desktop/Eclipse/Quijote_lineas.txt";
			    char letra =' '; 
			    
				String contenido = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, los días de entre semana se honraba con su vellori de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años, era de complexión recia, seco de carnes, enjuto de rostro; gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada o Quesada (que en esto hay alguna diferencia en los autores que deste caso escriben), aunque por conjeturas verosímiles se deja entender que se llama Quijana; pero esto importa poco a nuestro cuento; basta que en la narración dél no se salga un punto de la verdad.";
				FileWriter elQuijote1 = null;
				
			    
			    
		        try {
		        	
		        	elQuijote1 = new FileWriter(elQuijote);
		            BufferedWriter bw = new BufferedWriter(elQuijote1);
		            
		           
		            
		            
		            
			      //Escribimos tantas líneas como vueltas da el bucle
		            for (int i = 0; i < contenido.length(); i++){
		                //En cada línea escribimos “Linea 0” siendo 0 cada número de línea
		                bw.write(contenido.charAt(i));
		                
		                if (contenido.charAt(i)== '.' || contenido.charAt(i)== ','|| contenido.charAt(i)== ';') {
		                bw.newLine(); //Hace un salto de línea en el fichero
		                }
		            }
		            bw.flush(); //Hace la carga del buffer al fichero
		            
		            //Cerramos el fichero
		            elQuijote1.close();

		        	
		        } catch (IOException e) {
		            e.printStackTrace();
		        } 
		        
			}		
	
		
		
		
	
	
	
	
	
		public void leer2() {
			
			String elQuijote ="/Users/sandruski/Desktop/Eclipse/Quijote_lineas.txt";

			FileReader elQuijote2 = null;
			FileReader fr = null;
			BufferedReader br = null;

			
			
	        try {
	        	// Apertura del fichero y creación de BufferedReader para poder
	            // hacer una lectura línea a línea con el método readLine()
	            fr = new FileReader (elQuijote);
	            br = new BufferedReader(fr);

	            String linea;
	            // Lectura del fichero
	            linea=br.readLine();

	            // Recorremos línea a línea el fichero, hasta que acabe el fichero
	            while(linea!=null){
	               System.out.println(linea);
	            // Leemos la siguiente línea
	               linea=br.readLine();
	     }
	            
	     // Cierre del fichero         
	     fr.close(); 

	         } catch(Exception e){
	            e.printStackTrace();
	         }

		}
	
}
