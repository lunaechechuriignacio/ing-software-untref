package skeleton;

import skeleton.Posicion;
import skeleton.Tablero;
import org.junit.Assert;
import org.junit.Test;

public class TestTablero {

	@Test
	public void agregarUnAcorazadoHorizaontalConTableroVacio() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 1);
		String orientacionBarco = "Horizontal";
		String tipoBarco = "Acorazado";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		
		Assert.assertTrue(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnAcorazadoHorizaontalConUnBarcoEnElTablero() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 1);
		String orientacionBarco = "Horizontal";
		String tipoBarco = "Acorazado";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		tipoBarco = "Lancha";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		
		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnAcorazadoHorizaontalConLaPosicionFinalFueraDelTablero() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(2, 10);
		String orientacionBarco = "Horizontal";
		String tipoBarco = "Acorazado";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);

		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnAcorazadoFueraDelTableroDeLasColumanas() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 11);
		String orientacionBarco = "Horizontal";
		String tipoBarco = "Acorazado";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);

		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnAcorazadoFueraDelTableroDeLasFilas() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(11, 1);
		String orientacionBarco = "Horizontal";
		String tipoBarco = "Acorazado";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);

		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnaLanchaHorizaontalConLaPosicionFinalDentroDelTablero() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 10);
		String orientacionBarco = "Horizontal";
		String tipoBarco = "Lancha";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);

		Assert.assertTrue(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnAcorazadoVerticalConTableroVacio() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 1);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Acorazado";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		Assert.assertTrue(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnAcorazadoVerticalConUnBarcoEnElTablero() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(2, 1);
		Posicion posicion = new Posicion(1, 1);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Lancha";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		tipoBarco = "Destructor";
		tablero.agregarBarco(posicion, orientacionBarco, tipoBarco);
		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnDestructorVerticalConLaPosicionFinalFueraDelTablero() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(10, 10);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Destructor";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);

		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnDestructorFueraDelTableroDeLasColumanas() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 11);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Destructor";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);

		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void agregarUnDestructorFueraDelTableroDeLasFilas() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(11, 1);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Destructor";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);

		Assert.assertFalse(tablero.isEstadoBarcoAgregado());
	}

	@Test
	public void acertarDisparoDondeHayUnDestructor() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 1);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Destructor";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		tablero.dispararABarco(posicionInicial);
		
		Assert.assertTrue(tablero.getEstadoAciertoDistaro());
	}

	@Test
	public void errarDisparoDondeHayAgua() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 1);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Destructor";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		Posicion posicionAgua = new Posicion(1, 10);
		tablero.dispararABarco(posicionAgua);
		
		Assert.assertFalse(tablero.getEstadoAciertoDistaro());
	}

	@Test
	public void errarDisparoFueraDelTablero() {
		Tablero tablero = new Tablero(10);
		Posicion posicionInicial = new Posicion(1, 1);
		String orientacionBarco = "Vertical";
		String tipoBarco = "Destructor";
		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		Posicion posicionDisparo = new Posicion(1, 11);
		tablero.dispararABarco(posicionDisparo);
		
		Assert.assertFalse(tablero.getEstadoAciertoDistaro());
	}
}
