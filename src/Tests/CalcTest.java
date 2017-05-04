package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Controlador.Calculos;

public class CalcTest {

	@Test
	public void sumaTest() {
		Calculos c = new Calculos();
		assertEquals(5, c.sumar(2, 3));
	}
	
	@Test
	public void restaTest() {
		Calculos c = new Calculos();
		assertEquals(2, c.restar(5, 3));
	}
	
	@Test
	public void multiplicaTest() {
		Calculos c = new Calculos();
		assertEquals(10, c.multiplicar(5, 2));
	}
	
	@Test
	public void divideTest() {
		Calculos c = new Calculos();
		assertEquals(4, c.dividir(8, 2));
	}

}