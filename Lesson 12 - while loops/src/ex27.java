import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = bot.nextLine();
		int index = 0;
		
		while (index<str.length()) {
			System.out.print(str.charAt(index));
			index=index+2;
		}
	}

}
