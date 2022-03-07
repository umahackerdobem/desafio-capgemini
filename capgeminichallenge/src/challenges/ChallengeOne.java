package challenges;

import java.util.Arrays;

public class ChallengeOne {
	
	public static void sortArray(int array[]) {
		Arrays.sort(array);
	}
	
	public static int medianValue(int array[]) {
		int median = array.length / 2;
		
		return array[median];
	}
}
