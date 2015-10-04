package  skeleton;

public class DictionaryWordSecret {
	private String word;

	public DictionaryWordSecret(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public char[] wordInArrayChar()	{
		
		return word.toLowerCase().toCharArray();
	}
}
