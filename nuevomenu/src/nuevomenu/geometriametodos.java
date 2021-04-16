package nuevomenu;
import java.util.Scanner;

public class geometriametodos {
	
			
	    
		public static void main(String args[]){ 

	       Scanner entradaEscaner = new Scanner(System.in);
	        
		int menu=0, figuras=0, cuadrado=0, triangulo=0, circulo=0; 
		int mates=0;
		double base=0, altura=0, areacuadrado=0, areatriangulo=0, areacirculo=0, lado1=0, lado2=0, lado3=0, radio=0, perimetrocuadrado=0, perimetrotriangulo = 0, perimetrocirculo=0; 
		final double PI=3.14159;
		int mayor=0, menor=0, medio=0, exponente=0, a=0, b=0, c=0, d=0; 
		
		geometriaclases objeto1 = new geometriaclases (base, altura, radio, lado1, lado2, lado3, a, b, c, d, exponente);
		

		do {
			try {
				System.out.println("    ");
				System.out.println("..::BIENVENIDO::..");
				System.out.println("    ");
				System.out.println("    ");

				System.out.println("MENU PRINCIPAL");
				System.out.println("1 - Figuras geometricas");
				System.out.println("2 - Operaciones matematicas");
				System.out.println("3 - SALIR");
	  
				System.out.println("    ");
				System.out.println("ELIJA UNA OPCION: ");
				menu = entradaEscaner.nextInt();


		
	    

	            switch (menu) {
	            
					case 1:
	            

						do{
							try {
								System.out.println("    ");
								System.out.println("Ha elegido: FIGURAS GEOMETRICAS");
						
								System.out.println("    ");
								System.out.println("    ");

								System.out.println("MENU");
								System.out.println("1 - Cuadrado");
								System.out.println("2 - Triangulo");
								System.out.println("3 - Circulo");
								System.out.println("4 - VOLVER A MENU PRINCIPAL");
								System.out.println("    ");
					
								System.out.print("Elija una opcion: ");
	        
								figuras= entradaEscaner.nextInt();
	 
	        			

								int area;
								switch (figuras) {
	            
									case 1:
	            
										do{
											try{
												System.out.println("    ");
												System.out.println("Ha elegido: CUADRADO");
												System.out.println("    ");
												System.out.println("    ");

												System.out.println("OPCIONES");
												System.out.println("1 - Calculo del area");
												System.out.println("2 - Calculo del perimetro");    			
												System.out.println("3 - VOLVER A MENU GEOMETRIAS");
												System.out.println("    ");
					
												System.out.print("Elija una opcion: ");
	        
												cuadrado= entradaEscaner.nextInt();
	 
	        			

												switch (cuadrado) {
	            
												case 1:
	            

													do {
														try {

															System.out.println("    ");
															System.out.println("Ha elegido: Calculo del area");
													
															System.out.println("    ");
															System.out.println("Introduzca los datos necesarios");
															System.out.println("Base del cuadrado: ");
															base = entradaEscaner.nextInt();

															System.out.println("Altura del cuadrado: ");
															altura = entradaEscaner.nextInt();
															
															objeto1.setBase(base);
															objeto1.setAltura(altura);
															System.out.println(objeto1.areacuadrado());

	 
															} catch (Exception e) {
																System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
																entradaEscaner.nextLine();
														}
													} while (areacuadrado < 0);


	            
												break;
	            

												case 2:
	            
													do {
														try {
															System.out.println("    ");
															System.out.println("Ha elegido: calculo del perimetro");
												
															System.out.println("    ");
															System.out.println("Introduzca los datos necesarios");
															System.out.println("Lado 1 del cuadrado: ");
															lado1 = entradaEscaner.nextInt();

															System.out.println("Lado 2 del cuadrado: ");
															lado2 = entradaEscaner.nextInt();
															
															objeto1.setLado1(lado1);
															objeto1.setLado2(lado2);
									
															System.out.println(objeto1.perimetrocuadrado());
															
	 
														} catch (Exception e) {
															System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
															entradaEscaner.nextLine();
														}
													} while (perimetrocuadrado < 0);
	            
												break;


												case 3:
	            
													System.out.println("Ha elegido: VOLVER");
	            
												break;      
	            
				
												default:
	            
													System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 3");
													break;


												}

									
									
						            
											} catch (Exception e) {
												System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
												entradaEscaner.nextLine();
											}

										} while (cuadrado!=3);


	            
									break;
	            

									case 2:
	            
										do{
											try {
												System.out.println("Ha elegido: TRIANGULO");
											
												System.out.println("    ");
												System.out.println("    ");

												System.out.println("OPCIONES");
												System.out.println("1 - Calculo del area");
												System.out.println("2 - Calculo del perimetro");    			
												System.out.println("3 - VOLVER A MENU GEOMETRIAS ");
												System.out.println("    ");
					
												System.out.print("Elija una opcion: ");
	        
												triangulo= entradaEscaner.nextInt();
	 
	        			

												switch (triangulo) {
	            
													case 1:

											do {
												try {

													System.out.println("Ha elegido: Calculo del area");
													

													System.out.println("    ");
													System.out.println("Introduzca los datos necesarios");
											
													System.out.println("Base del triangulo: ");
													base = entradaEscaner.nextInt();

													System.out.println("Altura del triangulo: ");
													altura = entradaEscaner.nextInt();

													objeto1.setBase(base);
													objeto1.setAltura(altura);
													
													System.out.println(objeto1.areatriangulo());
													
													

													} catch (Exception e) {
												      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
												      entradaEscaner.nextLine();
													}

												} while (areatriangulo < 0);
	            
											break;
	            

											case 2:
										
												do {
													try {
														System.out.println("Ha elegido: calculo del perimetro");


														System.out.println("    ");
														System.out.println("Introduzca los datos necesarios");
														
														System.out.println("Lado 1 del triangulo: ");
														lado1 = entradaEscaner.nextInt();

														System.out.println("Lado 2 del triangulo: ");
														lado2 = entradaEscaner.nextInt();
														
														System.out.println("Lado 3 del triangulo: ");
														lado3 = entradaEscaner.nextInt();

														objeto1.setLado1(lado1);
														objeto1.setLado2(lado2);
														objeto1.setLado3(lado3);
									
													
														System.out.println(objeto1.perimetrotriangulo());

														} catch (Exception e) {
															System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
															entradaEscaner.nextLine();
														}
												} while (perimetrotriangulo < 0);
	            
											break;


											case 3:
	            
												System.out.println("Ha elegido: VOLVER");
	            
											break;      
	            
				
											default:
	            
												System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 3");
												break;
												}

											} catch (Exception e) {
												System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
												entradaEscaner.nextLine();
											}
											
										} while (triangulo!=3);
	            
									break;
									
									case 3:
	            
										do{
											try {
												System.out.println("Ha elegido: CIRCULO");
										
												System.out.println("    ");
												System.out.println("    ");

												System.out.println("OPCIONES");
												System.out.println("1 - Calculo del area");
												System.out.println("2 - Calculo del perimetro");    			
												System.out.println("3 - VOLVER A MENU GEOMETRIAS");
												System.out.println("    ");
					
												System.out.print("Elija una opcion: ");
	        
												circulo= entradaEscaner.nextInt();
	 
	        			

												switch (circulo) {
	            
													case 1:
	            
														do {
															try {
													
																System.out.println("Ha elegido: Calculo del area");


																System.out.println("    ");
																System.out.println("Introduzca los datos necesarios");
																
																System.out.println("radio: ");
																radio = entradaEscaner.nextInt();
																
																objeto1.setRadio(radio);
															
																System.out.println(objeto1.areacirculo());

															} catch (Exception e) {
																System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
																entradaEscaner.nextLine();
															}
														} while (areacirculo < 0);
	            			
													break;
	            
													case 2:
	            
														do {
															try {
																System.out.println("Ha elegido: calculo del perimetro");
												

																System.out.println("    ");
																System.out.println("Introduzca los datos necesarios");
																
																System.out.println("Radio: ");
																radio = entradaEscaner.nextInt();
																
																objeto1.setRadio(radio);

																System.out.println(objeto1.perimetrocirculo());
																
															} catch (Exception e) {
																System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
																entradaEscaner.nextLine();
															}

														} while (perimetrocirculo < 0);
	            
														break;


														case 3:
	            
															System.out.println("Ha elegido: VOLVER");
	            
														break;      
	            
				
														default:
	            
															System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 3");
														
														break;


													}

												} catch (Exception e) {
													System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
													entradaEscaner.nextLine();
											}

										} while (circulo!=3);
	            
									break;
	            
				
									default:
	            
										System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 4");
									
									break;


									}

								} catch (Exception e) {
							      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
							      entradaEscaner.nextLine();
								}

							} while (figuras!=4);


						break;
	   					
						
						case 2:
	            
							do{
								try {
									System.out.println("      ");
									System.out.println("Ha elegido: OPERACIONES MATEMATICAS");
						
									System.out.println("    ");
									System.out.println("    ");

									System.out.println("MENU");
									System.out.println("1 - Mayor o menor");
									System.out.println("2 - Elevar un numero");
									System.out.println("3 - VOLVER A MENU PRINCIPAL");
									System.out.println("    ");
					
									System.out.print("Elija una opcion: ");
	        
									mates= entradaEscaner.nextInt();
	 
	        			

									switch (mates) {
	            
										case 1:
	            
											do{
												try{System.out.println("      ");
													System.out.println("Ha elegido: MAYOR O MENOR");
											
												
													System.out.println("ELIJA 3 NUMEROS");
													System.out.println("1er numero: ");
													a = entradaEscaner.nextInt();
													System.out.println("2o numero: ");
													b = entradaEscaner.nextInt();
													System.out.println("3er numero: ");
													c = entradaEscaner.nextInt();
									
													objeto1.setA(a);
													objeto1.setB(b);
													objeto1.setC(c);
													
													objeto1.orden();
												
												} catch (Exception e) {
													System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
													entradaEscaner.nextLine();
												}
											}while (d!=1);
										
										break;
	            

										case 2:
											do {
												try {
																					
													System.out.println("      ");
													System.out.println("Ha elegido: ELEVAR UN NUMERO");
													System.out.println("       ");
													System.out.println("ELIJA 2 NUMEROS");
													System.out.println("Numero: ");
													a=entradaEscaner.nextInt();
													System.out.println("Elevado a: ");
													exponente = entradaEscaner.nextInt();
													
													objeto1.setA(a);
													objeto1.setExponente(exponente);
								
													System.out.println(objeto1.elevacion());
										
													
											
												} catch (Exception e) {
													System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
													entradaEscaner.nextLine();
												}
											}while (d!=1);
										
											break;


										case 3:
	            
											System.out.println("      ");
											System.out.println("Ha elegido: VOLVER AL MENU PRINCIPAL");
							
										break;         
	  
	            
										default:
	            
											System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 3");
											break;


										}
								} catch (Exception e) {
									System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
									entradaEscaner.nextLine();
								}
							} while (mates!=3);


							break;
	   					
					
					case 3:
	            
					System.out.println("Ha elegido: SALIR");
					System.out.println("Tenga un buen dia");
	            
					break;         
	  
					
					default:
	            
					System.out.println("ERROR EN LA ELECCION. ELIJA UN NUMERO DEL 1 AL 4");
	            
					break;

	        
				}
			
	            
			} catch (Exception e) {
			      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
			      entradaEscaner.nextLine();
		    }
		    } while (menu!=3);
			
		}

	}


