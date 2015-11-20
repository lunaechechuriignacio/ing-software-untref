
public class Envido {

	private Carta cartaUno, cartaDos, cartaTres;

	public Envido(Carta cartaUno, Carta cartaDos, Carta cartaTres) {

		this.cartaUno = cartaUno;
		this.cartaDos = cartaDos;
		this.cartaTres = cartaTres;

	}

	public int getValorEnvido() {

		int valorEnvido = 0;

		if (this.tresCartasIguales()) {
			valorEnvido = 20 + this.cartaDos.getNumero() + this.cartaUno.getNumero() + this.cartaTres.getNumero();
		} else

		if (this.DosCartasIgual()) {
			valorEnvido = this.getValorDosCartasIguales()+20;
		} else
			valorEnvido = this.getMayorCarta();

		return valorEnvido;
	}

	private int getMayorCarta() {
		int numero = this.cartaUno.getNumero();
		if ((numero < this.cartaDos.getNumero()) && (numero > this.cartaTres.getNumero()))
			numero = this.cartaDos.getNumero();
		else if (numero < this.cartaTres.getNumero())
			numero = this.cartaTres.getNumero();
		return numero;

	}

	private boolean tresCartasIguales() {
		return ((this.cartaUno.isEqualPalo(this.cartaDos)) && (this.cartaDos.isEqualPalo(this.cartaTres)));
	}

	private boolean DosCartasIgual() {
		return (((this.cartaUno.isEqualPalo(this.cartaDos)) && (!this.cartaUno.isEqualPalo(this.cartaTres)))
				|| ((this.cartaUno.isEqualPalo(this.cartaTres)) && (!this.cartaUno.isEqualPalo(this.cartaDos)))
				|| ((this.cartaDos.isEqualPalo(this.cartaTres)) && (!this.cartaDos.isEqualPalo(this.cartaUno))));
	}

	private int getValorDosCartasIguales() {

		int valor = 0;

		if (this.cartaUno.isEqualPalo(this.cartaDos)) {
			valor = this.cartaUno.getNumero() + this.cartaDos.getNumero();
		} else if (this.cartaUno.isEqualPalo(this.cartaTres)) {
			valor = this.cartaUno.getNumero() + this.cartaTres.getNumero();
		}

		else
			valor = this.cartaDos.getNumero() + this.cartaDos.getNumero();

		return valor;
	}

}
