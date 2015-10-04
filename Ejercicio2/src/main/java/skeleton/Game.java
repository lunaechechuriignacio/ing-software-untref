package skeleton;

public class Game {private Player player;
	private DictionaryWordSecret wordSecret;
	private char[] arrayWordSecret, discoveryWord;

	public Game(String namePlayer, int lifePlayer) {

		this.player = new Player(namePlayer, lifePlayer);

	}

	public void setWordSecret(String wordSecret) {

		this.wordSecret = new DictionaryWordSecret(wordSecret);
		this.arrayWordSecret = this.wordSecret.wordInArrayChar();
		this.discoveryWord = this.wordSecret.wordInArrayChar();
		this.fillAsteriskDiscoveryWord();
	}

	public char[] getDiscoverWord() {

		return this.discoveryWord;

	}

	private void fillAsteriskDiscoveryWord() {

		for (int positionArrayChar = 0; positionArrayChar < this.arrayWordSecret.length; positionArrayChar++) {

			this.discoveryWord[positionArrayChar] = '*';

		}
	}

	private void subtractLifePlayer() {

		this.player.setNumberLife(this.player.getNumberLife() - 1);

	}

	private boolean searchCharacterInWordSecret(char character) {
		boolean foundChar = false;
		for (int positionArrayChar = 0; positionArrayChar < this.arrayWordSecret.length; positionArrayChar++) {
			if (arrayWordSecret[positionArrayChar] == Character
					.toLowerCase(character)) {
				foundChar = true;
				discoveryWord[positionArrayChar] = Character
						.toLowerCase(character);
			}
		}
		return foundChar;
	}

	private boolean compareEqualsLengthWordSecrectAndDiscoveryWord() {

		return (this.arrayWordSecret == this.discoveryWord);
	}

	public int remainingLife() {

		return this.player.getNumberLife();
	}

	public boolean endGame() {
boolean result =!((this.remainingLife() > 0)
				&& (!this.compareEqualsLengthWordSecrectAndDiscoveryWord()));
		return result;
	}

	public void setLifePlayer(int numberLife) {
		this.player.setNumberLife(numberLife);

	}

	public void playGame(char character) {

		if (!this.endGame()) {

			boolean foundChar = this.searchCharacterInWordSecret(character);

			if ((!foundChar)&&(this.remainingLife()>0)) {

				this.subtractLifePlayer();

			}

		}
	}
}
