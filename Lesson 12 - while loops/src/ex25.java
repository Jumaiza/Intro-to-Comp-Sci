import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = bot.nextLine();
		int index = 0, aCount = 0;
		
		while (index<str.length()) {
			if (str.charAt(index) == 'a')
				aCount++;
			index++;
		}
			System.out.println("The letter \"a\" appears "+aCount+" times in your sentence");
	}

}
