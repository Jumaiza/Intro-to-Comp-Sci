import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner x = new Scanner(System.in);
	System.out.println("Please enter your whole name.");
	String name = x.nextLine();
	int count = name.length();
	System.out.println("Your name has "+count+" characters in it, how many would you like me to print?");
	int count2 = x.nextInt();
	System.out.println(name.substring(0,count2));
	
			
			
			
	}

}
