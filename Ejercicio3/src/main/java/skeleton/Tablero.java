package skeleton;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Barco> tablero;
	private int tamanoTablero;
	private boolean estadoBarcoAgregado, estadoAciertoDisparo;

	public Tablero(int tamano) {
		tablero = new ArrayList<Barco>();
		this.tamanoTablero = tamano;
	}

	private Barco crearBarco(String tipoBarco) {
		Barco barco = null;
		switch (tipoBarco) {

		case "Acorazado": {
			barco = new Acorazado(tipoBarco, 2);
			break;
		}
		case "Destructor": {
			barco = new Destructor(tipoBarco, 3);
			break;

		}
		case "Lancha": {
			barco = new Lancha(tipoBarco, 1);
			break;
		}

		}
		return barco;
	}

	public void agregarBarco(Posicion posicionInicial, String orientacionBarco,
			String tipoBarco) {
		Barco barco = null;
		this.setEstadoBarcoAgregado(false);
		if ((this.verificarLimiteDeTablero(posicionInicial.getFila()))
				&& (this.verificarLimiteDeTablero(posicionInicial.getColumna()))) {
			barco = this.crearBarco(tipoBarco);
			this.eleccionHorizontalOVertical(posicionInicial, barco,
					orientacionBarco);
			this.agregarBarcoAlTablero(barco);
		}
	}

	private void eleccionHorizontalOVertical(Posicion posicionInicial,
			Barco barco, String orientacion) {
		if (orientacion == "Horizontal")
			this.agregarBarcoHorinzontal(posicionInicial, barco);
		else
			this.agregarBarcoVertical(posicionInicial, barco);
	}

	private void agregarBarcoAlTablero(Barco barco) {
		if (this.isEstadoBarcoAgregado())
			this.tablero.add(barco);
	}

	private boolean verificarLimiteDeTablero(int posicion) {
		return ((posicion >= 0) && (posicion <= this.tamanoTablero));
	}

	private Posicion nuevaPosicion(int fila, int columna) {
		return new Posicion(fila, columna);
	}

	private boolean estadoPosicionLibre(Posicion posicion) {
		boolean estadoUbicacion = true;

		for (Barco barcoEncontrado : tablero) {
			if (barcoEncontrado.getPosicionTablero().contains(posicion))
				estadoUbicacion = false;
		}
		return estadoUbicacion;
	}

	private void agregarBarcoHorinzontal(Posicion posicionInicial, Barco barco) {
		boolean estadoPosicion = true;
		ArrayList<Posicion> ubicacion = new ArrayList<Posicion>();
		Posicion posicion;
		int cantidadDePosiciones = 0;
		while ((estadoPosicion)
				&& (cantidadDePosiciones < barco.getTamanoLongitud())) {
			posicion = nuevaPosicion(posicionInicial.getFila()
					, posicionInicial.getColumna()+ cantidadDePosiciones);
			ubicacion.add(posicion);
			estadoPosicion = ((this.estadoPosicionLibre(posicion)) && (this
					.verificarLimiteDeTablero(posicion.getColumna())));
			cantidadDePosiciones++;
		}
		barco.setPosicionTablero(ubicacion);
		this.setEstadoBarcoAgregado(estadoPosicion);
	}

	private void agregarBarcoVertical(Posicion posicionInicial, Barco barco) {
		boolean estadoPosicion = true;
		ArrayList<Posicion> ubicacion = new ArrayList<Posicion>();
		Posicion posicion;
		int cantidadDePosiciones = 0;
		while ((estadoPosicion)
				&& (cantidadDePosiciones < barco.getTamanoLongitud())) {
			posicion = nuevaPosicion(posicionInicial.getFila()+ cantidadDePosiciones,
					posicionInicial.getColumna() );
			ubicacion.add(posicion);
			estadoPosicion = ((this.estadoPosicionLibre(posicion)) && (this
					.verificarLimiteDeTablero(posicion.getFila())));
			cantidadDePosiciones++;
		}
		barco.setPosicionTablero(ubicacion);
		this.setEstadoBarcoAgregado(estadoPosicion);
	}

	public boolean isEstadoBarcoAgregado() {
		return estadoBarcoAgregado;
	}

	public boolean isBarcoHundido(Posicion posicion){
		Barco barcoEncontrado = null;
		for (Barco barcoBuscado : tablero) {
			if (barcoBuscado.isPosicionEnDisparosAcertados(posicion))
				barcoEncontrado=barcoBuscado;
		}
		return ((barcoEncontrado.isPosicionEnDisparosAcertados(posicion))&&(barcoEncontrado.isEstadoHundido()));
	}
	
	public void setEstadoBarcoAgregado(boolean estadoBarcoAgregado) {
		this.estadoBarcoAgregado = estadoBarcoAgregado;
	}

	public boolean getEstadoAciertoDistaro() {
		return this.estadoAciertoDisparo;
	}

	public void dispararABarco(Posicion posicionDeDisparo) {
		this.estadoAciertoDisparo = false;
		for (Barco barcoEncontrado : tablero) {
			if (barcoEncontrado.aciertoDisparo(posicionDeDisparo))
				this.estadoAciertoDisparo = true;
		}
	}
}

