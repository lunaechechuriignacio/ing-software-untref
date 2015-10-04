package skeleton;

public class Game {

	private Gamer gamerOne, gamerTwo;

	public void setGamerOne(Gamer gamerOne) {
		this.gamerOne = gamerOne;
	}

	public void setGamerTwo(Gamer gamerTwo) {
		this.gamerTwo = gamerTwo;
	}

	public Game() {

		this.gamerOne = new Gamer(1);
		this.gamerTwo = new Gamer(2);

	}

	public int getWinner() {

		int result = -1;

		if ((this.gamerOne.getConcurrentHand() != null)
				&& (this.gamerTwo.getConcurrentHand() != null)) {

			result = this.gamerOne.getConcurrentHand().comparateHand(
					this.gamerTwo.getConcurrentHand());

		}

		return result;
	}

	public int gamerWinner(int gamerNumber, Game game) {
		int resultWinner = 0;
		if ((gamerNumber == 1) && (game.getWinner() == 1)) {
			resultWinner = 1;
		} else if ((gamerNumber == 2) && (game.getWinner() == 2)) {
			resultWinner = 2;
		} else {
			resultWinner = 0;
		}
		return resultWinner;
	}

	public Gamer getGamerOne() {
		return gamerOne;
	}

	public Gamer getGamerTwo() {
		return gamerTwo;
	}

}
