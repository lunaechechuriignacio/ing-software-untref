package skeleton;

public class Scissor implements Hand {
	
	@Override
	public int comparateHand(Hand hand){
		int result=0;
		
	
		if (hand instanceof Stone) {
			
			result=2;
			
		} else if (hand instanceof Paper) {
			
			result=1;
		} else {
		
			result=0;
		
		}		
		
		return result;		
	}

}
