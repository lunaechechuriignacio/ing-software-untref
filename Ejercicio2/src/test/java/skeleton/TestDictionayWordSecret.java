package skeleton;

import skeleton.DictionaryWordSecret;
import org.junit.Assert;
import org.junit.Test;

public class TestDictionayWordSecret {

	@Test
	public void testAssignWord() {
		DictionaryWordSecret word = new DictionaryWordSecret("auto");
		Assert.assertEquals("auto", word.getWord());

	}

	@Test
	public void testSetMethodWord() {
		DictionaryWordSecret word = new DictionaryWordSecret("auto");
		word.setWord("avion");
		Assert.assertEquals("avion", word.getWord());

	}

	@Test
	public void testtoLowerCaseWord() {
		
		DictionaryWordSecret word = new DictionaryWordSecret("AUTO");
		
		Assert.assertEquals("AUTO", word.getWord());
		
		String wordToLowerCase = new String( word.wordInArrayChar());
		
		Assert.assertEquals("auto", wordToLowerCase);

	}


}
