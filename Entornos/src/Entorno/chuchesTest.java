package Entorno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class chuchesTest {
	chuches prueba;
	static int bolsas;
	int chocolates;
	double euros;
	String cliente;

	//Se ejecuta al principio de la prueba
		
	@BeforeAll //BeforeClass en Junit4 sin ser static
	static void testBeforeAll() {
	System.out.println("Empieza el Junit");
	}
		
	//Se ejecuta al final de la prueba
	@AfterAll  //AfterClass en Junit4 sin ser static
	static void testAfterAll() {
	System.out.println("Acaba el Junit");
	}
	
	//Se ejecuta antes de cada @Test
		@BeforeEach  //Before en Junit4
		void testBefore() {
			System.out.println("Empieza un Test");
			bolsas= 34;
			chocolates =100;
			euros = 601.32;
			cliente = "Patricia";
			chuches o1 =new chuches (34, 100, 601.32, "Patricia");
		}
		
		//Se ejecuta despu�s de cada @Test
		@AfterEach  //After en Junit4
		void testAfter() {
			System.out.println("Acaba un Test");
		}
	
	@Test
	void testChuchesIntIntDoubleString() {
		
	}

	@Test
	void testChuches() {
		System.out.println("Test Constructor");
		
		
	}

	@Test
	void testPaquetes() {
		System.out.println("Test Paquetes");
		chuches o1 =new chuches (34, 100, 601.32, "Patricia");
		int paquetes = o1.paquetes();
		int esperadopaquete = 5; //   100/20
		assertEquals(esperadopaquete, paquetes);
		
		if (esperadopaquete==paquetes) {
			System.out.println("Test paquetes correcto");
		}else {
			System.out.println("Test paquetes incorrecto");
		}
	}

	@Test
	void testCajas() {
		System.out.println("Test Cajas");
		chuches o1 = new chuches (34, 100, 601.32, "Patricia");
		int cajas = o1.cajas();
		int esperadocajas = 3; //   34/10
		assertEquals(esperadocajas,cajas);
		if (esperadocajas==cajas) {
			System.out.println("Test cajas correcto");
		}else {
			System.out.println("Test cajas incorrecto");
		}
	}

	@Test
	void testPesetas() {
		System.out.println("Test Pesetas");
		chuches o1 = new chuches (34, 100, 601.32, "Patricia");
		int pesetas = o1.cajas();
		int esperadopesetas = 100051; //   601.32*166.386 sin decimales 
		assertEquals(esperadopesetas,pesetas);
		if (pesetas==esperadopesetas) {
			System.out.println("Test paquetes correcto");
		}else {
			System.out.println("Test paquetes incorrecto");
		}
	}

	@Test
	void testGetBolsas() {
		
	}

	@Test
	void testSetBolsas() {
		
	}

	@Test
	void testGetChocolates() {
		
	}

	@Test
	void testSetChocolates() {

	}

	@Test
	void testGetEuros() {
	
	}

	@Test
	void testSetEuros() {
		
	}

	@Test
	void testGetCliente() {
		
	}

	@Test
	void testSetCliente() {
		
	}

	@Test
	void testMain() {
		
	}

}
