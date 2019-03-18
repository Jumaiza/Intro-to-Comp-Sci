import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		String fName,lName,fullName;
		System.out.println("What is your first name?");
		fName = x.nextLine();
		System.out.println("What is your last name?");
		lName = x.nextLine();
		fullName = fName+" "+lName;
		System.out.println("Your full name is "+fullName);
		
		
	}

}
