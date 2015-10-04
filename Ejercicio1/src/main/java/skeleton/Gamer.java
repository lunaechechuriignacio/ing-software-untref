package skeleton;

public class Gamer {

	private int gamer;

	private Hand concurrentHand;

	public Gamer(int gamer) {

		this.gamer = gamer;
		this.concurrentHand = null;
	}

	public void game(Hand concurrentHand) {

		this.concurrentHand = concurrentHand;

	}

	public void setGamer(int gamer) {
		this.gamer = gamer;
	}

	public Hand getConcurrentHand() {
		return concurrentHand;
	}

	public void setConcurrentHand(Hand concurrentHand) {
		this.concurrentHand = concurrentHand;
	}

	public int getGamer() {
		return gamer;
	}

}
