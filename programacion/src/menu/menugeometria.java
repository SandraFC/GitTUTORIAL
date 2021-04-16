package menu;

import java.util.Scanner; 


public class menugeometria{ 
    
    
	public static void main(String args[]){ 

       Scanner entradaEscaner = new Scanner(System.in);
        
	int menu;     


	
	do {
	System.out.println("    ");
	System.out.println("..::BIENVENIDO::..");
	System.out.println("    ");
	System.out.println("    ");

	System.out.println("MENU");
	System.out.println("1 - Figuras geometricas");
    System.out.println("2 - Operaciones matemáticas");
    System.out.println("3 - SALIR");
  
    System.out.println("    ");
	System.out.println("ELIJA UN NUMERO DEL MENU: ");
	menu = entradaEscaner.nextInt();


	
    

            switch (menu) {
            
				case 1:
            
				System.out.println("Ha elegido: FIGURAS GEOMETRICAS");

					
					int figuras=0;

					do{
					System.out.println("    ");
					System.out.println("    ");

					System.out.println("MENU");
					System.out.println("1 - Cuadrado");
    				System.out.println("2 - Triangulo");
    				System.out.println("3 - Circulo");
   					System.out.println("4 - VOLVER A MENU PRINCIPAL");
    				System.out.println("    ");
				
					System.out.print("Escribe un numero: ");
        
					figuras= entradaEscaner.nextInt();
 
        			

						switch (figuras) {
            
							case 1:
            
							System.out.println("Ha elegido: CUADRADO");
            
							break;
            

							case 2:
            
							System.out.println("Ha elegido: TRIANGULO");
            
							break;
            

							case 3:
            
							System.out.println("Ha elegido: CIRCULO");
            
							break;
            
			
							default:
            
							System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 4");
							break;


							}



					} while (figuras!=4);


					break;
   					
					         

				case 2:
            
				System.out.println("Ha elegido: OPERACIONES MATEMATICAS");

					
					int mates=0;

					do{
					System.out.println("    ");
					System.out.println("    ");

					System.out.println("MENU");
					System.out.println("1 - Mayor o menor");
    				System.out.println("2 - Elevar un numero");
   					System.out.println("3 - VOLVER A MENU PRINCIPAL");
    				System.out.println("    ");
				
					System.out.print("Escribe un numero: ");
        
					mates= entradaEscaner.nextInt();
 
        			

						switch (mates) {
            
							case 1:
            
							System.out.println("Ha elegido: MAYOR O MENOR");
            
							break;
            

							case 2:
            
							System.out.println("Ha elegido: ELEVAR UN NUMERO");
            
							break;
            

				
							default:
            
							System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 3");
							break;


							}



					} while (mates!=3);


					break;
   					
					         
  
				
				default:
            
				System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 4");
            
				break;

        
			}
 
		} while (menu!=3);
		
	}

}

   