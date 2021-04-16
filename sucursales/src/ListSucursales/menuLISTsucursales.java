package ListSucursales;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class menuLISTsucursales {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaString = new Scanner(System.in) ;
		Scanner entradaNumeros = new Scanner(System.in);
		
		String empleado =" ", apellidos=" ", apellido=" ", apellido1=" ", espacio=" ";
		int sucursal=0, numempleados=2, numapellido=0, menu=0; 
		boolean encontrado=false;
		
		//crear arraylist
		ArrayList<banco> datos =new ArrayList<banco>();
		//el arraylist debe tener un tamaño inicial si se crea en un bucle
		for(int i=0; i<numempleados; i++){
			try{
		
			datos.add(i, new banco(empleado, apellidos, sucursal));
		 	
			System.out.println("    ");
			System.out.println("Datos del empleado " + (i+1) + ":");	
			System.out.println("    ");
			System.out.println("Nombre empleado: ");
			empleado = entradaString.nextLine();
			//agregarlo con setEmpleado lo he intentado datos.set(i, datos.Empleado(i))
			datos.get(i).getEmpleado();
		
	
		    System.out.println("    ");
		    System.out.println("Apellidos del empleado: ");
			apellidos = entradaString.nextLine();
			datos.get(i).getApellidos();
		    
		    System.out.println("    ");
		    System.out.println("Numero de su sucursal: ");
			sucursal = entradaNumeros.nextInt();
			datos.get(i).getSucursal();
		   
		   
		     System.out.println(empleado + ", " + apellidos + ", " +sucursal);
		     System.out.println("-----------");
		 	
		 	}catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      System.out.println("    ");
			      entradaNumeros.nextLine();
		    }
		 	}
		
		//lista de empleados
		System.out.println("Lista de empleados");
		for (int i=0; i<datos.size(); i++) {
			System.out.println(" Nombre del empleado " + (i+1) + ": "+ datos.get(i).getEmpleado() +  " " + datos.get(i).getApellidos() );
			System.out.println(" Sucusal del empleado " + (i+1) + "; " + datos.get(i).getSucursal());
			System.out.println("    ");
		}

	 
	
	
	
	
	do {
		try {
		System.out.println("    ");
		System.out.println("..::BIENVENIDO::..");
		System.out.println("    ");
		System.out.println("    ");

		System.out.println("MENU PRINCIPAL");
		System.out.println("1 - SALIR");
	    System.out.println("2 - EMPLEADO DA SUCURSAL");
	    System.out.println("3 - SUCURSAL DA NOMBRES DE EMPLEADOS");
	    System.out.println("4 - EMPLEADOS CON EL MISMO APELLIDO");
	    System.out.println("5 - NUMERO DE EMPLEADOS BANCO");
	    System.out.println("6 - LISTA EMPLEADOS ALFAB�TICAMENTE");
	  
	    System.out.println("    ");
		System.out.println("ELIJA UNA OPCION: ");
		menu = entradaNumeros.nextInt();
		System.out.println("    ");
	     
		
		switch (menu){
			case 1: 
				System.out.println("1 - SALIR");
				System.out.println("Pase un buen dia");
			break;
			case 2: 
				try {
				System.out.println("2 - EMPLEADO DA SUCURSAL");
				 System.out.println("    ");
				 
				 
				 do {
				 System.out.println("Nombre del empleado: ");
			     empleado=entradaString.nextLine();
			    
			     for (int i=0; i<datos.size(); i++) {
			    	
			    	 	if (datos.get(i).getEmpleado().equals(empleado)){
			    		 					    		 
			    		 
			    	 		
			    System.out.println(empleado + " pertenece a la sucursal: " +  datos.get(i).getSucursal());
			    
			    		 encontrado=false;
			    	 	}
					    	else if (encontrado=false){
					    		System.out.println(empleado + " no pertenece al banco");
					    		encontrado=false;
					    	}
			    	 
				     
			    	 
			    	 
			     }
			     
				 }while(encontrado=false);
				}catch (Exception e) {
				      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
				      System.out.println("    ");
				      entradaNumeros.nextLine();
			    }
					
			break;
			case 3: 
				try {
				 System.out.println("3 - SUCURSAL DA NOMBRES DE EMPLEADOS");
				 System.out.println("    ");
				 System.out.println("sucursal del empleado: ");
			     sucursal=entradaNumeros.nextInt();
			    
			     for (int i=0; i<datos.size(); i++) {
			    	 	
			    	 	if (sucursal==datos.get(i).getSucursal()){
			    		 					    		 
			    		 System.out.println("la sucursal " + datos.get(i).getSucursal() + " tiene el empleado: " + datos.get(i).getEmpleado());
			    		 encontrado=true;
			    	 	}
					    	else if (i==datos.size()){
					    		System.out.println(empleado + " no pertenece al banco");
					    	}
			    	 
				
			     }
				}catch (Exception e) {
				      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
				      System.out.println("    ");
				      entradaNumeros.nextLine();
			    }
				 break;
			case 4: 
				try {
				System.out.println("4 - EMPLEADOS CON EL MISMO APELLIDO");
			
				System.out.println("    ");
				
				
				System.out.println("Primer apellido: ");
			    apellido=entradaString.nextLine();
			    
		
				for (int i = 0; i<datos.size(); i++) {
					 //apellidos incluye dos hay que hacer un substring
					apellido1=datos.get(i).getApellidos().substring(0, datos.get(i).getApellidos().indexOf(espacio));
					
					

					if (apellido.equals(apellido1)){	 	
				    
				    	
				    	++numapellido;
				    	
				    	
						}
						    else if (i==datos.size()){
						    	System.out.println("No hay empleados con el apellido " + apellido);
						    	}
				     
				}
				
				System.out.println("en el banco hay " + numapellido + " con el apellido " + apellido);
			    
				}catch (Exception e) {
				      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
				      System.out.println("    ");
				      entradaNumeros.nextLine();
			    }
			break;
			case 5: 
				System.out.println("5 - NUMERO DE EMPLEADOS BANCO");
				System.out.println(numempleados+1);
			break;
			case 6: 
			
					
				String nombres[]=new String[numempleados];
				
				for (int i=0; i<nombres.length; i++){
					
					nombres[i]=datos.get(i).getEmpleado();
				}
				
				
				System.out.println("6 - LISTA EMPLEADOS ALFABATICAMENTE");
				
				//paso a array para ordenar 
				//busqué en internet como hacerlo con arraylist
				Object[] datos2 = datos.toArray();
				
				Arrays.sort(nombres);

		
				for (int i=0; i < datos2.length; i++) {
					
			    System.out.println(((banco) datos2[i]).getEmpleado());
			    }
				
			break;
			default:
				System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO");
		}
		}catch (Exception e) {
		      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
		      System.out.println("    ");
		      entradaNumeros.nextLine();
	    }
	}while(menu!=1);



}

}


		 	
			