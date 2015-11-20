

import org.junit.Assert;
import org.junit.Test;

public class EnvidoTest {
	
	@Test
	public void probarMano3CartasDistintoPalo(){
		Carta cartaUno = new Carta(1,"Oro");
		Carta cartaDos = new Carta(1,"Espada");
		Carta cartaTres= new Carta(3,"Copa");		
		Envido mano= new Envido(cartaUno,cartaDos,cartaTres);
		
		Assert.assertEquals(3,mano.getValorEnvido());
	}
	/*
	//@Test
	public void probarMano3CartasMismoPalo(){
		Carta carta1 = new Carta(3,Palo.COPA);
		Carta carta2 = new Carta(1,Palo.COPA);
		Carta carta3 = new Carta(4,Palo.COPA);		
		Envido mano= new Envido(carta1,carta2,carta3);
		
		Assert.assertEquals(27,mano.getValorEnvido());
	}
	
	@Test
	public void probarManoSolo2CartasMismoPalo(){
		Carta carta1 = new Carta(1,Palo.COPA);
		Carta carta2 = new Carta(7,Palo.COPA);
		Carta carta3 = new Carta(1,Palo.ORO);		
		Envido mano= new Envido(carta1,carta2,carta3);
		
		Assert.assertEquals(28,mano.getValorEnvido());
	}
*/}
