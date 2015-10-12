package  skeleton;

import java.util.ArrayList;

public class Barco {

	private String tipoDeBarco;
	private int tamanoLongitud;
	ArrayList<Posicion> posicionTablero, posicionDisparosAcertados;

	public Barco(String tipoDeBarco, int tamanoLongitud) {
		this.tipoDeBarco = tipoDeBarco;
		this.posicionTablero = new ArrayList<Posicion>();
		this.posicionDisparosAcertados = new ArrayList<Posicion>();
		this.tamanoLongitud = tamanoLongitud;
	}

	public boolean aciertoDisparo(Posicion posicion) {
		if ((this.posicionTablero.contains(posicion))
				&& (!this.isEstadoHundido())) {
			this.posicionDisparosAcertados.add(posicion);
			this.posicionTablero.remove(posicion);
			return true;
		}
		return false;
	}

	public int cantidadDeDisparosAcertados() {
		return this.posicionDisparosAcertados.size();
	}

	public boolean isEstadoHundido() {
		return this.posicionDisparosAcertados.size() == this.tamanoLongitud;
	}

	public void setPosicionTablero(ArrayList<Posicion> posicionTablero) {
		this.posicionTablero = posicionTablero;
	}

	public String getTipoDeBarco() {
		return tipoDeBarco;
	}

	public int getTamanoLongitud() {
		return tamanoLongitud;
	}

	public ArrayList<Posicion> getPosicionTablero() {
		return this.posicionTablero;
	}
}
