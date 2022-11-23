import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarroSoma {

	CarroDeCorrida c;
	
	@BeforeEach
	public void inicializaCarro() {
		c=new CarroSoma("Teste",10,100);
	}
	
	@Test
	public void testeCarroParado() {
		
		assertEquals(0, c.getVelocidade());
	}

	@Test
	void testAcelerar() {
		
		//c.potencia = 10;
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}

	@Test
	void testFrear() {
		
		//c.potencia = 10;
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}

	@Test
	void testFrearAteZero() {
		
		//c.potencia = 10;
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	void testAcelerarAteVelocidadeMaxima() {
		
		for(int i=0; i<14; i++)
			c.acelerar();
		assertEquals(100, c.getVelocidade());
	}

}
