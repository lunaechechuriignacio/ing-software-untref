package skeleton;

import java.util.ArrayList;
import skeleton.Barco;
import skeleton.Destructor;
import skeleton.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class TestDestructor {

	ArrayList<Posicion> posicionTablero;

	@Test
	public void asignarTipodeBarcoYLongitud() {
		Destructor destructor = new Destructor("Destructor", 3);
		Assert.assertEquals("Destructor", destructor.getTipoDeBarco());
		Assert.assertEquals(3, destructor.getTamanoLongitud());
	}

	@Test
	public void seteoLaPosicionDelBarcoYAciertoElDisparo() {
		Destructor destructor = new Destructor("Destructor", 3);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		destructor.setPosicionTablero(this.posicionTablero);

		Assert.assertTrue(destructor.aciertoDisparo(posicion2));
	}

	@Test
	public void seteoLaPosicionDelBarcoYNoAciertoElDisparo() {
		Destructor destructor = new Destructor("Destructor", 3);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		Posicion posicion3 = new Posicion(1, 4);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		destructor.setPosicionTablero(this.posicionTablero);

		Assert.assertFalse(destructor.aciertoDisparo(posicion3));
	}

	@Test
	public void disparoYElBarcoNoSeHundio() {
		Destructor destructor = new Destructor("Destructor", 3);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		destructor.setPosicionTablero(this.posicionTablero);
		destructor.aciertoDisparo(posicion2);

		Assert.assertFalse(destructor.isEstadoHundido());
	}

	@Test
	public void disparoDosVecesYElBarcoNoSeHundio() {
		Destructor destructor = new Destructor("Destructor", 3);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		Posicion posicion3 = new Posicion(1, 3);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		this.posicionTablero.add(posicion3);
		destructor.setPosicionTablero(this.posicionTablero);
		destructor.aciertoDisparo(posicion1);
		destructor.aciertoDisparo(posicion2);

		Assert.assertFalse(destructor.isEstadoHundido());
	}

	@Test
	public void disparoTresVecesYElBarcoseSeHundio() {
		Destructor destructor = new Destructor("Destructor", 3);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		Posicion posicion3 = new Posicion(1, 3);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		this.posicionTablero.add(posicion3);
		destructor.setPosicionTablero(this.posicionTablero);
		destructor.aciertoDisparo(posicion1);
		destructor.aciertoDisparo(posicion2);
		destructor.aciertoDisparo(posicion3);

		Assert.assertTrue(destructor.isEstadoHundido());
	}
}
