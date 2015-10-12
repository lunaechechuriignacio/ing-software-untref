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
}
