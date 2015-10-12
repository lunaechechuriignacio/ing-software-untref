package skeleton;

public class BatallaNaval {
	private boolean estadoBarcoAgregado;
	private Tablero tablero;

	public BatallaNaval(int tamanoTablero) {
		tablero = new Tablero(tamanoTablero);
	}

	public void ubicarBarco(int fila, int columna, String tipoBarco,
			String orientacionBarco) {
		Posicion posicionInicial = new Posicion(fila, columna);

		tablero.agregarBarco(posicionInicial, orientacionBarco, tipoBarco);
		this.estadoBarcoAgregado = tablero.isEstadoBarcoAgregado();
	}

	public boolean getEstadoBarcoAgregado() {
		return this.estadoBarcoAgregado;
	}

}
