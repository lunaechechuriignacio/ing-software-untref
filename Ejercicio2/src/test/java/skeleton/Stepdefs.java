package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefs {
	
	Game ahorcado = new Game("jugador", 7);
	@Given("^la palabra secreta es \"(.*?)\"$")
	
	public void la_palabra_secreta_es(String wordSecret) throws Throwable {
		ahorcado.setWordSecret(wordSecret);

	}

	@When("^arriesgo \"(.*?)\"$")
	public void arriesgo(char letter) throws Throwable {
		ahorcado.playGame(letter);

	}

	
	
	@Then("^estado es \"(.*?)\"$")
	public void estado_es(String estadoPalabra) throws Throwable {
	   Assert.assertEquals(estadoPalabra, new String(ahorcado.getDiscoverWord()));
	}


	@Then("^me quedan (\\d+) vidas$")
	public void me_quedan_vidas(int life) throws Throwable {

		Assert.assertEquals(ahorcado.remainingLife(), life);

	}



}
