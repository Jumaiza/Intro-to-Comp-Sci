import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bot = new Scanner(System.in);
		int entries = 0, counter = 0, num = 0, min = 0, max = 0;
		while(entries <= 1) {
			System.out.println("How many numbers you will enter?");
			entries = bot.nextInt();
		}
		while(counter < entries) {
			System.out.println("Enter value " + (counter+1)) ;
			num = bot.nextInt();
			if(num < min)
				min = num;
			else if(num > max)
				max = num;
			counter++;
		}
		System.out.println("Min value: " + min + "\tMax value: " + max);
		
	}
	}

