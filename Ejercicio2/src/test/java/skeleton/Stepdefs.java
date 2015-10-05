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
		ahorcado.setLifePlayer(7);
	}

	@Given("^me quedan (\\d+) vida$")
	public void me_quedan_vida(int lifes) throws Throwable {
		ahorcado.setLifePlayer(lifes);
	}

	@When("^arriesgo \"(.*?)\"$")
	public void arriesgo(char letter) throws Throwable {
		ahorcado.playGame(letter);
	}

	@When("^el estado es \"(.*?)\"$")
	public void estado_es1(String estado) throws Throwable {
		ahorcado.setDiscoveryWord(estado.toCharArray());
	}

	@Then("^estado es \"(.*?)\"$")
	public void estado_es(String estadoPalabra) throws Throwable {
		String prueba = new String(ahorcado.getDiscoverWord());
		Assert.assertEquals(estadoPalabra, prueba);
	}

	@Then("^me quedan (\\d+) vidas$")
	public void me_quedan_vidas(int life) throws Throwable {
		Assert.assertEquals(ahorcado.remainingLife(), life);
	}

}
