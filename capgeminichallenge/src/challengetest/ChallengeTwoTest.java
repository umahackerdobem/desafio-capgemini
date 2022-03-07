package challengetest;

import challenges.ChallengeTwo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ChallengeTwoTest {
	
	@Test
	public void testPairElementn() {
		int array[] = {1, 5, 3, 4, 2};
		int x = 2;
								
		int expectedReturn = 3;		
				
		int madeReturn = ChallengeTwo.pairElement(array, x);
		
		assertEquals(expectedReturn, madeReturn);

	}	
}
