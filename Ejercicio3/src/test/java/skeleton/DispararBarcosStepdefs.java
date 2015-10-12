package skeleton;

import skeleton.BatallaNaval;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DispararBarcosStepdefs {
	private BatallaNaval batallaNaval;
	
	@Given("^no hay barcos en posicion (\\d+),(\\d+)$")
	public void no_hay_barcos_en_posicion(int arg1, int arg2) throws Throwable {
	   batallaNaval=new BatallaNaval(10);
	}

	@When("^disparo a la posicion (\\d+),(\\d+)$")
	public void disparo_a_la_posicion(int fila, int columna) throws Throwable {
	   batallaNaval.disparar(fila,columna);
	}

	@Then("^el disparo dio en el agua$")
	public void el_disparo_dio_en_el_agua() throws Throwable {
	   Assert.assertFalse(batallaNaval.isEstadoDisparoABarco());
	}
}
