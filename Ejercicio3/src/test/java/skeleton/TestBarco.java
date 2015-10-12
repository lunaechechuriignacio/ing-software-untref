package  skeleton;

import java.util.ArrayList;
import skeleton.Barco;
import skeleton.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class TestBarco {

	ArrayList<Posicion> posicionTablero;

	@Test
	public void asignarTipodeBarcoYLongitud() {
		Barco barco = new Barco("Acorazado", 2);
		Assert.assertEquals("Acorazado", barco.getTipoDeBarco());
		Assert.assertEquals(2, barco.getTamanoLongitud());
	}

	@Test
	public void seteoLaPosicionDelBarcoYAciertoElDisparo() {
		Barco barco = new Barco("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		barco.setPosicionTablero(this.posicionTablero);

		Assert.assertTrue(barco.aciertoDisparo(posicion2));
	}

	@Test
	public void seteoLaPosicionDelBarcoYNoAciertoElDisparo() {
		Barco barco = new Barco("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		Posicion posicion3 = new Posicion(1, 4);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		barco.setPosicionTablero(this.posicionTablero);

		Assert.assertFalse(barco.aciertoDisparo(posicion3));
	}

	@Test
	public void disparoYElBarcoNoSeHundio() {
		Barco barco = new Barco("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		barco.setPosicionTablero(this.posicionTablero);

		Assert.assertTrue(barco.aciertoDisparo(posicion2));
		Assert.assertFalse(barco.isEstadoHundido());
	}
	
	@Test
	public void disparoDosVecesYElBarcoSeHundio() {
		Barco barco = new Barco("Acorazado", 2);
		this.posicionTablero = new ArrayList<Posicion>();
		Posicion posicion1 = new Posicion(1, 1);
		Posicion posicion2 = new Posicion(1, 2);
		this.posicionTablero.add(posicion1);
		this.posicionTablero.add(posicion2);
		barco.setPosicionTablero(this.posicionTablero);
		barco.aciertoDisparo(posicion1);
		barco.aciertoDisparo(posicion2);
		
		Assert.assertTrue(barco.isEstadoHundido());
	}
}
