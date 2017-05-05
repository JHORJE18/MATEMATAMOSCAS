package Tests;

import static org.junit.Assert.*;
import Controlador.Registro;
import org.junit.Test;

public class RegistrosTest {

	@Test
	public void testNombre() {
		Registro r = new Registro();
		assertTrue(r.nombreValido("Jorge"));
	}
	
	@Test
	public void testApedillos() {
		Registro r = new Registro();
		assertTrue(r.apedilloValido("Lopez Gil"));
	}
	
	@Test
	public void testContrasena() {
		Registro r = new Registro();
		assertTrue(r.contrasenaValida("hola001"));
	}

}
