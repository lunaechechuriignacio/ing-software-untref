package skeleton;

import skeleton.BatallaNaval;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class UbicarBarcosStepdefs {
private BatallaNaval batallaNaval;

	@Given("^posicion \\((\\d+),(\\d+)\\) esta libre y posicion \\((\\d+),(\\d+)\\) esta libre$")
	public void posicion_esta_libre_y_posicion_esta_libre(int arg1, int arg2,
			int arg3, int arg4) throws Throwable {
		batallaNaval = new BatallaNaval(2);

	}

	@When("^jugador posiciona un \"(.*?)\" en la posicion \\((\\d+),(\\d+)\\) \"(.*?)\"$")
	public void jugador_posiciona_un_en_la_posicion(String tipoBarco, int fila,
			int columna, String orientacionBarco) throws Throwable {
		batallaNaval.ubicarBarco(fila, columna, tipoBarco, orientacionBarco);

	}

	@Then("^barco posicionado exitosamente$")
	public void barco_posicionado_exitosamente() throws Throwable {
		Assert.assertTrue(batallaNaval.getEstadoBarcoAgregado());

	}

	@Given("^hay un barco en posicion \\((\\d+),(\\d+)\\)$")
	public void hay_un_barco_en_posicion(int fila, int columna)
			throws Throwable {
		String tipoBarco = "Lancha";
		String orientacionBarco = "Horizontal";
		batallaNaval = new BatallaNaval(10);
		batallaNaval.ubicarBarco(fila, columna, tipoBarco, orientacionBarco);
	}

	@When("^jugador posiciona un barco en la posicion \\((\\d+),(\\d+)\\) \"(.*?)\"$")
	public void jugador_posiciona_un_barco_en_la_posicion(int fila,
			int columna, String orientacionBarco) throws Throwable {
		String tipoBarco = "Lancha";

		batallaNaval.ubicarBarco(fila, columna, tipoBarco, orientacionBarco);
	}

	@Then("^posicion ocupada no se puede ubicar el barco alli$")
	public void posicion_ocupada_no_se_puede_ubicar_el_barco_alli()
			throws Throwable {
		Assert.assertFalse(batallaNaval.getEstadoBarcoAgregado());
	}
	
	@When("^jugador posiciona un  \"(.*?)\" en la posicion \\((\\d+),(\\d+)\\) \"(.*?)\"$")
	public void jugador_posiciona_un_en_la_posicion1(String tipoBarco, int fila, int columna, String orientacionBarco) throws Throwable {
		batallaNaval.ubicarBarco(fila, columna, tipoBarco, orientacionBarco);
	}
}

