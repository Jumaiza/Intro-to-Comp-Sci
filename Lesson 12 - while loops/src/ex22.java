import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a low number");
		int low = bot.nextInt();
		System.out.println("Enter a high number");
		int high = bot.nextInt();
		while (low<high) {
			if (low%4==0 && low%5!=0)
				System.out.println(low);
			low++;
		}
	}

}
