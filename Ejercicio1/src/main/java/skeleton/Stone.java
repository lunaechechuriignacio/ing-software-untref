package skeleton;

public class Stone implements Hand {

	@Override
	public int comparateHand(Hand hand) {
		int result = 0;

		if (hand instanceof Paper) {

			result = 2;

		} else if (hand instanceof Scissor) {

			result = 1;
		} else {

			result = 0;

		}

		return result;
	}

}
