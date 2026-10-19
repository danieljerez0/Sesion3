package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion3.Cuenta;

class CuentaTest {

	Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500.0);
		
		assertEquals(500.0, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(500.0);
		
		assertEquals(-500.0, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		Cuenta cuenta12345 = new Cuenta(50.0);
		Cuenta cuenta67890 = new Cuenta(0.0);
		
		cuenta12345.retirar(200.0);
		cuenta67890.retirar(350.0);
		cuenta12345.ingresar(100.0);
		cuenta67890.retirar(200.0);
		cuenta67890.retirar(150.0);
		cuenta12345.retirar(200.0);
		cuenta67890.ingresar(50.0);
		cuenta67890.retirar(100.0);
		
		assertEquals(-250.0, cuenta12345.getSaldo());
		assertEquals(-450.0, cuenta67890.getSaldo());

	}

}
