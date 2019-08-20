import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = bot.nextLine();
		int index = str.length()-1;
		String reverse = "";
	
		while (index>=0) {
			reverse = reverse+str.charAt(index);
			index--;
		}
		System.out.println(reverse);
	}

}
