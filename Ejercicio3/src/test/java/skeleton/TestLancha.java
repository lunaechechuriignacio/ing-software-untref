package skeleton;

import java.util.ArrayList;
import skeleton.Lancha;
import skeleton.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class TestLancha {

	ArrayList<Posicion> posicionTablero;

	@Test
	public void asignarTipodeBarcoYLongitud() {
		Lancha lancha = new Lancha("Lancha", 1);
		
		Assert.assertEquals("Lancha", lancha.getTipoDeBarco());
		Assert.assertEquals(1, lancha.getTamanoLongitud());
	}

	@Test
	public void seteoLaPosicionDelBarcoYAciertoElDisparo() {
		Lancha lancha = new Lancha("Lancha", 1);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		this.posicionTablero.add(posicion1);
		lancha.setPosicionTablero(this.posicionTablero);

		Assert.assertTrue(lancha.aciertoDisparo(posicion1));
	}

	@Test
	public void seteoLaPosicionDelBarcoYNoAciertoElDisparo() {
		Lancha lancha = new Lancha("Lancha", 1);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		lancha.setPosicionTablero(this.posicionTablero);

		Assert.assertFalse(lancha.aciertoDisparo(posicion2));
	}

	@Test
	public void disparoYElBarcoSeHundio() {
		Lancha lancha = new Lancha("Lancha", 1);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		this.posicionTablero.add(posicion1);
		lancha.setPosicionTablero(this.posicionTablero);
		lancha.aciertoDisparo(posicion1);

		Assert.assertTrue(lancha.isEstadoHundido());
	}

}
