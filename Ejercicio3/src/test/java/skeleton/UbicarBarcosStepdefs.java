package skeleton;

import skeleton.BatallaNaval;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class UbicarBarcosStepdefs {

		private BatallaNaval batallaNaval;
		@Given("^posicion \\((\\d+),(\\d+)\\) esta libre y posicion \\((\\d+),(\\d+)\\) esta libre$")
		public void posicion_esta_libre_y_posicion_esta_libre(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		   batallaNaval=new BatallaNaval(2);
		    
		}

		@When("^jugador posiciona un \"(.*?)\" en la posicion \\((\\d+),(\\d+)\\) \"(.*?)\"$")
		public void jugador_posiciona_un_en_la_posicion(String tipoBarco, int fila, int columna, String orientacionBarco) throws Throwable {
		   batallaNaval.ubicarBarco(fila, columna, tipoBarco, orientacionBarco);
		
		}

		@Then("^barco posicionado exitosamente$")
		public void barco_posicionado_exitosamente() throws Throwable {
		  Assert.assertTrue(batallaNaval.getEstadoBarcoAgregado());
			
			
		}
}

