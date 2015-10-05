package skeleton;

public class Game {

	private Player player;
	private DictionaryWordSecret wordSecret;
	private char[] arrayWordSecret, discoveryWord;
	private String badEndGame = "ahorcado";

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

	public void setDiscoveryWord(char[] discoveryWord) {
		this.discoveryWord = discoveryWord;
	}

	private void fillAsteriskDiscoveryWord() {

		for (int positionArrayChar = 0; positionArrayChar < this.arrayWordSecret.length; positionArrayChar++) {

			this.discoveryWord[positionArrayChar] = '*';

		}
	}

	private void subtractLifePlayer(char character) {
		if ((!this.searchCharacterInWordSecret(character))
				&& (this.remainingLife() > 0)) {
			this.player.setNumberLife(this.player.getNumberLife() - 1);
			this.replacedDiscoveryWordWithBadEnd();
		}
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

	private boolean compareEqualsWordSecrectAndDiscoveryWord() {
		return (this.arrayWordSecret == this.discoveryWord);
	}

	public int remainingLife() {
		return this.player.getNumberLife();
	}

	public boolean endGame() {
		boolean result = !((this.remainingLife() > 0) && (!this
				.compareEqualsWordSecrectAndDiscoveryWord()));
		return result;
	}

	public void setLifePlayer(int numberLife) {
		this.player.setNumberLife(numberLife);
	}

	private void replacedDiscoveryWordWithBadEnd() {
		boolean result = !this.compareEqualsWordSecrectAndDiscoveryWord();
		if ((result) && (this.remainingLife() == 0))
			this.discoveryWord = this.badEndGame.toCharArray();
	}

	public void playGame(char character) {

		if (!this.endGame()) {

			this.subtractLifePlayer(character);

		} else {
			this.replacedDiscoveryWordWithBadEnd();
		}
	}
}
