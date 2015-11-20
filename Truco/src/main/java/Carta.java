public class Carta {
	
	String palo;
	private int numero;
	
	public Carta(int numero,String palo) {
		
		if (verificarRangoNumero(numero)) {
		
			this.palo=palo;
			this.numero=numero;
		} 
	}

	public boolean isEqualPalo(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}

	public boolean esEqualNumero(Carta carta) {
		return this.getNumero() == carta.getNumero();
	}
	private boolean verificarRangoNumero(int numero){
		
		return ((numero>=1)&&(numero<=7)) || 
				((numero>=10)&&(numero<=12));
	}
	public String getPalo() {
		return palo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
}
