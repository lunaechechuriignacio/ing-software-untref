package skeleton;

public class Posicion {
	private int fila, columna;

	public Posicion(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	public boolean isIgual(Posicion posicion) {
		return ((posicion.getFila()) == this.fila && (posicion.getColumna() == this.columna));
	}

	@Override
	public int hashCode() {

		return (((this.fila - 1) * 10) + this.columna);

	}

	@Override
	public boolean equals(Object obj) {
		Posicion posicion = (Posicion) obj;
		return ((this.fila == posicion.getFila()) && (this.columna == posicion
				.getColumna()));

	}
}
