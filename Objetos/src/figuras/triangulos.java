package figuras;

import java.util.Scanner; 
public class triangulos {
	
	Scanner entradaEscaner = new Scanner(System.in);
	double base;
	double altura;
	double lado1;
	double lado2;
	double lado3;

	public triangulos(double Base, double Altura, double Lado1, double Lado2, double Lado3) {
		base = Base;
		altura = Altura;
		lado1 = Lado1;
		lado2 = Lado2;
		lado3 = Lado3;
	}
	


	
	public double area() {
		double area= (base*altura)/2;
		return area;
	}
		
	public double perimetro() {
		double perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
	
	public static void main (String[] args) {
		Scanner entradaEscaner = new Scanner(System.in);
		
		double area = 0.0, perimetro =0.0, base=0.0, altura=0.0, lado1=0.0, lado2=0.0, lado3=0.0;
		
	
		
		System.out.println("Introduce una base: ");
		base = entradaEscaner.nextInt();
		System.out.println("Introduce una altura: ");
		altura = entradaEscaner.nextInt();
		
		
		triangulos t1 =new triangulos(base,altura, lado1, lado2, lado3);
		
		area=t1.area();
		
		System.out.println("El area del triangulo es " + t1.area());
		
		System.out.println("El area del triangulo es " + area);
		
		
		
		System.out.println(" ");
		
		System.out.println("Introduce un lado 1: ");
		
		lado1 = entradaEscaner.nextInt();
		System.out.println("Introduce un lado 2: ");
		lado2 = entradaEscaner.nextInt();
		System.out.println("Introduce un lado 3: ");
		lado3 = entradaEscaner.nextInt();
		
		triangulos t2 =new triangulos (base,altura, lado1, lado2, lado3);

		perimetro=t2.perimetro();
		
		System.out.println("El perimetro del triangulo es " + t2.perimetro());
		System.out.println("El perimetro del triangulo es " + perimetro);
	}
}
