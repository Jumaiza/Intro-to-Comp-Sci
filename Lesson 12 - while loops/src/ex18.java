import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		final int SENTINEL = 10;
		int num;
		do {
			System.out.println("Enter a number");
			num  = bot.nextInt();
		}while (num!=SENTINEL);
	}

}
