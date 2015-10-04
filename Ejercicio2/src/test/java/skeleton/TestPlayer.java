package skeleton;


import skeleton.Player;

import org.junit.Assert;
import org.junit.Test;

public class TestPlayer {

	@Test
	public void testAssingName() {
		Player player=new Player("pedro",7);
		Assert.assertEquals(player.getPlayer(),"pedro");
	}
	
	@Test
	public void testAssingLifeNumber() {
		Player player=new Player("pedro",7);
		Assert.assertEquals(player.getNumberLife(),7);
	}
	
	public void testSetMethodName() {
		Player player=new Player("pedro",7);
		player.setPlayer("juan");
		Assert.assertEquals(player.getPlayer(),"juan");
	}
	
	@Test
	public void testSetMethodLifeNumber() {
		Player player=new Player("pedro",7);
		player.setNumberLife(player.getNumberLife()-2);
		Assert.assertEquals(player.getNumberLife(),5);
	}

}
