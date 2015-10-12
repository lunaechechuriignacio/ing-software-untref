package  skeleton;

import skeleton.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class TestPosicion {

	@Test
	public void asignarFilaYColumna() {
		Posicion posicion = new Posicion(10, 5);
		Assert.assertEquals(posicion.getFila(), 10);
		Assert.assertEquals(posicion.getColumna(), 5);
	}
	
	@Test
	public void comparoDosPosicionesIguales() {
		Posicion posicion = new Posicion(10, 5);
	Assert.assertTrue(posicion.isIgual(posicion));
	}

	@Test
	public void comparoDosPosicionesDistintas() {
		Posicion posicion = new Posicion(10, 5);
		Posicion posicion2 = new Posicion(5,10 );
		Assert.assertFalse(posicion.isIgual(posicion2));
	}
}
