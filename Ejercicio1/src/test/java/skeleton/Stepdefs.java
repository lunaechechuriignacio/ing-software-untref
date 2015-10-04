package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefs {
	
		private Game game = new Game();
	private int gamerWinner = 0;

	@Given("^jugador1 juega PIEDRA$")
	public void gamerOnePlarStone() throws Throwable {
		Hand hand = new Stone();
		this.game.getGamerOne().game(hand);

	}
	@When("^jugador2 juega PIEDRA$")
	public void gamerTwoPlayStone() throws Throwable {
		Hand hand = new Stone();
		this.game.getGamerTwo().game(hand);
	}

	@Then("^hay empate$")
	public void hay_empate() throws Throwable {
		int gamer = 0;

		Assert.assertEquals(gamer, this.game.getWinner());

	}

	@Given("^jugador1 juega TIJERA$")
	public void gamerOnePlayScissor() throws Throwable {
		Hand hand = new Scissor();
		this.game.getGamerOne().game(hand);
	}

	@When("^jugador2 juega TIJERA$")
	public void gamerTwoPlayScissor() throws Throwable {
		Hand hand = new Scissor();
		this.game.getGamerTwo().game(hand);

	}
	
		@Given("^jugador1 juega PAPEL$")
	public void gamerOnePlayPaper() throws Throwable {
		Hand hand = new Paper();
		this.game.getGamerOne().game(hand);
	}
	
	@When("^jugador2 juega PAPEL$")
	public void gamerTwoPlayPaper() throws Throwable {
		Hand hand = new Paper();
		this.game.getGamerTwo().game(hand);

	}
	
	@Then("^gana jugador(\\d+)$")
	public void wimmerGamer(int gamerNumber) throws Throwable {
		
		Assert.assertEquals(gamerNumber, this.game.gamerWinner(gamerNumber, this.game));
	}
	
	

}
