package  skeleton;

public class Player {

	private String player;
private int numberLife;
	
	public Player(String player, int numberLife	) {

		this.player = player;
		this.numberLife=numberLife;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getNumberLife() {
		return numberLife;
	}

	public void setNumberLife(int numberLife) {
		this.numberLife = numberLife;
	}

	

}
