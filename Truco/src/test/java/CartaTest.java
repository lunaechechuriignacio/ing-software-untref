


import org.junit.Assert;
import org.junit.Test;

public class CartaTest {
	
	
	@Test
	public void comparoCartasDelMismoTipoTest(){
		
		Carta cartaEspadaUno = new Carta(2,"Espada");
		
		Carta cartaEspadaDos = new Carta(4,"Espada");
		
		Assert.assertTrue(cartaEspadaUno.isEqualPalo(cartaEspadaDos));
		Assert.assertTrue(cartaEspadaDos.isEqualPalo(cartaEspadaUno));
		
	}
	@Test
	public void comparoCartasDeDistintoTipoTest(){
		
		Carta cartaEspadaUno = new Carta(2,"Espada");
	
		Carta cartaEspadaDos = new Carta(4,"Basto");
		
		Assert.assertFalse(cartaEspadaUno.isEqualPalo(cartaEspadaDos));
		Assert.assertFalse(cartaEspadaDos.isEqualPalo(cartaEspadaUno));
		
	}
}
