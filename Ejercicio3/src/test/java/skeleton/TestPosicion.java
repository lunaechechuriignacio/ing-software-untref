package skeleton;

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

}
