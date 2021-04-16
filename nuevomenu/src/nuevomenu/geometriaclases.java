package nuevomenu;

public class geometriaclases {
	final double PI=3.14159;
	double base;
	double altura;
	double radio;
	double lado1;
	double lado2;
	double lado3;
	int a;
	int b;
	int c;
	int d;
	int exponente;
	


	public geometriaclases (double Base, double Altura, double Radio, double Lado1, double Lado2, double Lado3, int A, int B, int C, int D, int Exponente) {
		
		base=Base;
		altura=Altura;
		radio=Radio;
		lado1=Lado1;
		lado2=Lado2;
		lado3=Lado3;
		a=A;
		b=B;
		c=C;
		d=D;
		exponente=Exponente;
	}
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public double getLado3() {
		return lado3;
	}


	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}


	public int getExponente() {
		return exponente;
	}


	public void setExponente(int exponente) {
		this.exponente = exponente;
	}


	public double areacuadrado() {
		double areacuadrado= (base*altura);

		if (areacuadrado >0)  {
			System.out.println("el area del cuadrado es: BASE * ALTURA = " + areacuadrado);
		}
			else if (areacuadrado <0) {
				System.out.println("LA BASE Y LA ALTURA NO PUEDEN SER NEGATIVAS");
			}
	return areacuadrado;
	}
	
	public double areatriangulo() {
		double areatriangulo=(base*altura)/2;

		if (areatriangulo >0)  {
			System.out.println("el area del triangulo es: BASE * ALTURA / 2= " + areatriangulo);
		}
			else if (areatriangulo <0) {
				System.out.println("LA BASE Y LA ALTURA NO PUEDEN SER NEGATIVAS");
			}
	return areatriangulo;
	}
	
	public double areacirculo() {
		double areacirculo=(PI*(radio*radio));

		if (areacirculo >0)  {
			System.out.println("el area del circulo es: PI * RARIO AL CUADRADO= " + areacirculo);
		}
			else if (areacirculo <0) {
				System.out.println("EL RADIO NO PUEDE SER NEGATIVO");
			}
	return areacirculo;
	}
	
	public double perimetrocuadrado() {
		double perimetrocuadrado= (lado1*2)+(lado2*2);

		if (perimetrocuadrado >0)  {
			System.out.println("el area del cuadrado es: lado1 + lado2+ lado1 + lado2 = " + perimetrocuadrado);
		}
			else if (perimetrocuadrado <0) {
				System.out.println("LOS LADOS NO PUEDEN SER NEGATIVAS");
			}
	return perimetrocuadrado;
	}
	
	public double perimetrotriangulo() {
		double perimetrotriangulo= lado1 + lado2 + lado3;

		if (perimetrotriangulo >0)  {
			System.out.println("el area del cuadrado es: lado1 + lado2+ lado1 + lado2 = " + perimetrotriangulo);
		}
			else if (perimetrotriangulo <0) {
				System.out.println("LOS LADOS NO PUEDEN SER NEGATIVAS");
			}
	return perimetrotriangulo;	
	}
	
	public double perimetrocirculo() {
		double perimetrocirculo =(2*PI)*radio;

		if (perimetrocirculo >0)  {
			System.out.println("el perimetro del circulo es: 2 * PI * RADIO: " + perimetrocirculo);
		}
			else if (perimetrocirculo <0) {
				System.out.println("LOS LADOS NO PUEDEN SER NEGATIVOS");
			}
		
	return perimetrocirculo;	
	}

	public void orden() {
	int orden;
	int mayor;
	int menor;
	int medio;

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
	
	
	}
	
	public int elevacion() {
		
		for (b=1; b<=exponente; b++) {
			c=c*a;

		}
		
		//funciona pero si ingresas valores altos para a y exponente sale c=0 no se por que
		//He intentado declarar c con long pero sigue dando 0 o resultados raros

		System.out.println("el numero " + a + " elevado a " + exponente + " = " + c);

		d++;
		
	return elevacion();	
	}
	

}
