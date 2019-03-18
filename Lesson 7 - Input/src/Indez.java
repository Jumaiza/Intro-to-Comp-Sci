import java.util.Scanner;

public class Indez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String word = x.nextLine();
		System.out.println("What letter shall I find?");
		String letter = x.nextLine();
		int number = word.indexOf(letter);
		System.out.println("Your letter occurs at index "+number);
		
		
		
	}

}
