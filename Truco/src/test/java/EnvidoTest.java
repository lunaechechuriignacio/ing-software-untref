
import org.junit.Assert;
import org.junit.Test;

public class EnvidoTest {

	@Test
	public void envidoConDosCartasDelMismoTipo(){
		Carta carta1 = new Carta(2,"Espada");
		Carta carta2 = new Carta(7,"Espada");
		Carta carta3 = new Carta(1,"Basto");		
		Envido mano= new Envido(carta1,carta2,carta3);
		
		Assert.assertEquals(29,mano.getValorEnvido());
	}
	
	@Test
	public void envidoConTresCartasDistintoTipo() {
		Carta cartaUno = new Carta(1, "Oro");
		Carta cartaDos = new Carta(1, "Espada");
		Carta cartaTres = new Carta(3, "Copa");
		Envido mano = new Envido(cartaUno, cartaDos, cartaTres);

		Assert.assertEquals(3, mano.getValorEnvido());
	}
}
