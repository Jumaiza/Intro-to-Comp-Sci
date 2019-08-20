import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = bot.nextInt();
		while (x>0) {
			System.out.println("Your number is positive");
			break;
		}
		while (x<=0) {
			System.out.println("Your number is not positive, retry");
			break;
		}
	}

}
