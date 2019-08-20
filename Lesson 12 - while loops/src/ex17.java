import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = bot.nextInt();
		while (x%2==0) {
			System.out.println("You number is even");
			break;
		}
		while (x%2!=0) {
			System.out.println("You have an odd number");
			break;
		}
	}

}
