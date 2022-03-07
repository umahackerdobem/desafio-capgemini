package challengetest;

import challenges.ChallengeThree;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ChallengeThreeTest {
	
	@Test
	public void testEncrypt() {
		String text  = "tenha um bom dia";
		String expectedReturn ="taoa eum nmd hbi";		
				
		String madeReturn = ChallengeThree.encrypt(text);
		
		assertEquals(expectedReturn, madeReturn);
	}	
}
