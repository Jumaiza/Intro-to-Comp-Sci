import java.util.Scanner;

public class project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = bot.nextLine();
		
		for(int x = 0; x < sentence.length(); x++) {
			
			if(x%2 == 0)
				System.out.print(sentence.toUpperCase().charAt(x));
			else
				System.out.print(sentence.toLowerCase().charAt(x));
		}
	}

}
