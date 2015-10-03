package skeleton;

public class Game {
	
	private Gamer gamerOne;
	private Gamer gamerTwo;
	
	public int getWinner() {
		
		int resultadoGanador=-1;
		
		if ((this.gamerOne.getConcurrentHand() != null)&&(this.gamerTwo.getConcurrentHand() != null)) {
			
			resultadoGanador=this.gamerOne.getConcurrentHand().comparateHand(this.gamerTwo.getConcurrentHand());
		
		}
		
		return resultadoGanador;
	}
	
	public void setGamerOne (Gamer gamerOne) {
		this.gamerOne = gamerOne;
	}

	public void setGamerTwo(Gamer gamerTwo) {
		this.gamerTwo = gamerTwo;
	}

	public Game(){
	
		this.gamerOne= new Gamer(1);
		this.gamerTwo= new Gamer(2);
		
	}

	public Gamer getGamerOne() {
		return gamerOne;
	}

	public Gamer getGamerTwo() {
		return gamerTwo;
	}
	
	

}
