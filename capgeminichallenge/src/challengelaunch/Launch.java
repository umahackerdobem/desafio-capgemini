package challengelaunch;

import challenges.ChallengeOne;
import challenges.ChallengeThree;
import challenges.ChallengeTwo;

import java.util.Arrays;

public class Launch {

	public static void main(String[] args) {
 
		  System.out.println("---------- CHALLENGE ONE ----------");
		  
		  int arrayOne[] = {9, 2, 1, 4, 6};
		  		  
		  System.out.println("Original array: " + Arrays.toString(arrayOne));
		  
		  ChallengeOne.sortArray(arrayOne); System.out.println("Ordenated array: " +  Arrays.toString(arrayOne));
		  
		  System.out.println("Median Value: " + ChallengeOne.medianValue(arrayOne));
		  
		  
		  System.out.println("\n---------- CHALLENGE TWO ----------");
		  
		  int arrayTwo[] = {1, 5, 3, 4, 2};
		  
		  System.out.println("Original array: " + Arrays.toString(arrayTwo));
		  System.out.println("There are " + ChallengeTwo.pairElement(arrayTwo, 2) + " pairs of integers in the vector with a difference of 2");
		  
		  System.out.println("\n---------- CHALLENGE THREE ----------");
		
		  String text = "tenha um bom dia";
		  
		  System.out.println("Original text:" + text);
		  System.out.println("Encrypted Text:" + ChallengeThree.encrypt(text));
	}

}
