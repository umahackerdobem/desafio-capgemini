package challengetest;

import challenges.ChallengeOne;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ChallengeOneTest {
	
	@Test
	public void testMedian() {
		int array[]  = {9, 2, 4, 7, 6};
		int expectedReturn = 4;		
				
		int madeReturn = ChallengeOne.medianValue(array);
		
		assertEquals(expectedReturn, madeReturn);

	}	
}
