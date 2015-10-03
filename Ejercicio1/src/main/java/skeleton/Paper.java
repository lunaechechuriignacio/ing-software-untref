package skeleton;

public class Paper implements Hand {
	
	@Override
	public int comparateHand(Hand hand){
		int result=0;
		
	
		if (hand instanceof Scissor) {
			
			result=2;
			
		} else if (hand instanceof Stone) {
			
			result=1;
		} else {
		
			result=0;
		
		}		
		
		return result;		
	}

}
