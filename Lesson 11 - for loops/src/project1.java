import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Type a word or sentence");
		String x = bot.nextLine();
		
		for (int y=0; y < x.length(); y++)
			System.out.println(x.substring(y,y+1));
	}

}
