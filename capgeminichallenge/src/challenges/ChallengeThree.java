package challenges;

public class ChallengeThree {

	public static String encrypt(String text) {
		String textWithoutSpaces = text.trim().replaceAll("\\s+", "");
		int textLength = textWithoutSpaces.length();
		int arraySize = (int) Math.round(Math.sqrt(textLength));

		String arrayCharacter[] = textWithoutSpaces.split("");
		String grid[][] = new String[arraySize][arraySize];
		
		String textEncrypted = "";
		
		int count = 0;
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				if (count < textLength) {
					grid[i][j] = arrayCharacter[count];
					count++;
				}
			}
		}

		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				if (grid[j][i] != null) {
					textEncrypted += grid[j][i];
				}
			}
			textEncrypted += " ";
		}
		
		textEncrypted.trim();
		 
		return textEncrypted;
	}
}
