package test.java.skeleton;

import java.util.ArrayList;
import skeleton.Acorazado;
import skeleton.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class TestAcorazado {

	ArrayList<Posicion> posicionTablero;

	@Test
	public void asignarTipodeBarcoYLongitud() {
		Acorazado acorazado = new Acorazado("Acorazado", 2);
		Assert.assertEquals("Acorazado", acorazado.getTipoDeBarco());
		Assert.assertEquals(2, acorazado.getTamanoLongitud());
	}

	@Test
	public void seteoLaPosicionDelBarcoYAciertoElDisparo() {
		Acorazado acorazado = new Acorazado("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		acorazado.setPosicionTablero(this.posicionTablero);

		Assert.assertTrue(acorazado.aciertoDisparo(posicion2));
	}

	@Test
	public void seteoLaPosicionDelBarcoYNoAciertoElDisparo() {
		Acorazado acorazado = new Acorazado("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		Posicion posicion3 = new Posicion(1, 4);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		acorazado.setPosicionTablero(this.posicionTablero);

		Assert.assertFalse(acorazado.aciertoDisparo(posicion3));
	}

	@Test
	public void disparoYElBarcoNoSeHundio() {
		Acorazado acorazado = new Acorazado("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		acorazado.setPosicionTablero(this.posicionTablero);
		acorazado.aciertoDisparo(posicion2);

		Assert.assertFalse(acorazado.isEstadoHundido());
	}

	@Test
	public void disparoDosVecesYElBarcoSeHundio() {
		Acorazado acorazado = new Acorazado("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		Posicion posicion3 = new Posicion(1, 3);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		this.posicionTablero.add(posicion3);
		acorazado.setPosicionTablero(this.posicionTablero);
		acorazado.aciertoDisparo(posicion1);
		acorazado.aciertoDisparo(posicion2);

		Assert.assertTrue(acorazado.isEstadoHundido());
	}

}
