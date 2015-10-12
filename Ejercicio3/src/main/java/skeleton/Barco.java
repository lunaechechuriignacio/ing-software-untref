package skeleton;

public class Barco {

	private String tipoDeBarco;
	private int tamanoLongitud;

	public Barco(String tipoDeBarco, int tamanoLongitud) {
		this.tipoDeBarco = tipoDeBarco;
		this.tamanoLongitud = tamanoLongitud;
	}

	public String getTipoDeBarco() {
		return tipoDeBarco;
	}

	public int getTamanoLongitud() {
		return tamanoLongitud;
	}

}
