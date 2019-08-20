import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Print a positive number");
		int number = bot.nextInt();
		int factor = 1;
		while (factor<=number/2) {
			if (number%factor==0)
				System.out.println(factor);
			factor++;
		}
	}

}
