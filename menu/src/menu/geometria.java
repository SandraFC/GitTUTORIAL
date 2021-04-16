package menu;

import java.util.Scanner; 


public class geometria{ 
    
    
	public static void main(String args[]){ 

       Scanner entradaEscaner = new Scanner(System.in);
        
	int menu=0, figuras=0, cuadrado=0, triangulo=0, circulo=0; 
	int mates=0;
	double base=0, altura=0, area=0, lado1=0, lado2=0, lado3=0, radio=0, perimetro=0; 
	final double PI=3.14159;
	int mayor=0, menor=0, medio=0, exponente=0, a=0, b=0, c=0, d=0; 
	

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

														area=(base*altura);

															if (area >0)  {
																System.out.println("el area del cuadrado es: BASE * ALTURA = " + area);
															}
																else if (area <0) {
																	System.out.println("LA BASE Y LA ALTURA NO PUEDEN SER NEGATIVAS");
																}
 
														} catch (Exception e) {
															System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
															entradaEscaner.nextLine();
													}
												} while (area < 0);


            
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
								
														perimetro= (lado1*2)+(lado2*2);

														if (perimetro >0)  {
															System.out.println("el area del cuadrado es: lado1 + lado2+ lado1 + lado2 = " + perimetro);
														}
															else if (perimetro <0) {
																System.out.println("LOS LADOS NO PUEDEN SER NEGATIVAS");
															}
 
													} catch (Exception e) {
														System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
														entradaEscaner.nextLine();
													}
												} while (perimetro < 0);
            
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
												System.out.print("Introduzca los datos necesarios");
										
												System.out.println("Base del triangulo: ");
												base = entradaEscaner.nextInt();

												System.out.println("Altura del triangulo: ");
												altura = entradaEscaner.nextInt();

												area=(base*altura)/2;

													if (area >0)  {
														System.out.println("el area del triangulo es: BASE * ALTURA / 2 = " + area);
													}
														else if (area <0) {
															System.out.println("LA BASE Y LA ALTURA NO PUEDEN SER NEGATIVAS");
															}

												} catch (Exception e) {
											      System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
											      entradaEscaner.nextLine();
												}

											} while (area < 0);
            
										break;
            

										case 2:
									
											do {
												try {
													System.out.println("Ha elegido: calculo del perimetro");


													System.out.println("    ");
													System.out.println("Introduzca los datos necesarios");
													
													System.out.println("Lado 1 del cuadrado: ");
													lado1 = entradaEscaner.nextInt();

													System.out.println("Lado 2 del cuadrado: ");
													lado2 = entradaEscaner.nextInt();

													perimetro= (lado1*2)+(lado2*2);

													if (perimetro >0)  {
														System.out.println("el perimetro del cuadrado es: LADO 1 + LADO 2 + LADO 1 + LADO 2 = " + perimetro);
													} 
														else if (perimetro <0) {
															System.out.println("LOS LADOS NO PUEDEN SER NEGATIVOS");
														}
													} catch (Exception e) {
														System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
														entradaEscaner.nextLine();
													}
											} while (perimetro < 0);
            
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

															area=(PI*(radio*radio));

															if (area >0)  {
																System.out.println("el area del circulo es: PI * RARIO AL CUADRADO= " + area);
															}
																else if (area <0) {
																	System.out.println("EL RADIO NO PUEDE SER NEGATIVO");
																}

														} catch (Exception e) {
															System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
															entradaEscaner.nextLine();
														}
													} while (area < 0);
            			
												break;
            
												case 2:
            
													do {
														try {
															System.out.println("Ha elegido: calculo del perimetro");
											

															System.out.println("    ");
															System.out.println("Introduzca los datos necesarios");
															
															System.out.println("Radio: ");
															radio = entradaEscaner.nextInt();

															perimetro =(2*PI)*radio;

																if (perimetro >0)  {
																	System.out.println("el perimetro del circulo es: 2 * PI * RADIO: " + perimetro);
																}
																	else if (perimetro <0) {
																		System.out.println("LOS LADOS NO PUEDEN SER NEGATIVOS");
																	}
															
														} catch (Exception e) {
															System.out.println("Debe introdudir solo numeros. Intentelo de nuevo");
															entradaEscaner.nextLine();
														}

													} while (perimetro < 0);
            
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
								
												d=0;
											
												if ((a>b) && (a>c))  {
												mayor= a;
												}
													else if ((b>a) && (b>c)) {
														mayor= b;
													} 
														else {
															mayor = c;
														}
								
												if ((a<b) && (a<c))  {
													menor= a;
												}
													else if ((b<a) && (b<c)) {
														menor= b;	
													} 
														else {
															menor = c;
														}
								
												medio = (a + b + c) - (mayor + menor);

												System.out.println("      ");
												System.out.println("De mayor a menor es: " + mayor + " > " + medio + " > " + menor);
						       
												d++;
											
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
							
												c=1;
												d=0;
						
							
												for (b=1; b<=exponente; b++) {
													c=c*a;
													
							
												}
												
												//funciona pero si ingresas valores altos para a y exponente sale c=0 no se por que
												//He intentado declarar c con long pero sigue dando 0 o resultados raros
						
												System.out.println("el numero " + a + " elevado a " + exponente + " = " + c);
						
												d++;
												
										
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

   