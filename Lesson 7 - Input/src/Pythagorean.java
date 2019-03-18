import java.util.Scanner;

public class Pythagorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter your A value");
		double aValue = x.nextDouble();
		System.out.println("Please enter your B value");
		double bValue = x.nextDouble();
		System.out.println("Square root of "+aValue+" squared + "+bValue+" squared = "+(Math.sqrt(Math.pow(aValue,2)+Math.pow(bValue,2))));
		
		
		
	}

}
