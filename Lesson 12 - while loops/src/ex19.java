import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		final int SENTINEL = 0;
		int num = 1;
		int product = 1;
		while(num != SENTINEL) {
			product *= num;
			System.out.println("Enter a number, 0 to stop");
			num = bot.nextInt();
		}
		System.out.println("Final product: " + product);
	}

}
