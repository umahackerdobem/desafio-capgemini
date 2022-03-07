package challenges;

public class ChallengeTwo {

	public static int pairElement(int array[], int x) {

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] - array[j] == x) || (array[j] - array[i] == x)) {
					count++;
				}
			}
		}
		
		return count;
	}
}
