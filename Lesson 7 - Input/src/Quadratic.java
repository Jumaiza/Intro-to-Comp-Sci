import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
		System.out.println("Please enter the A value.");
		double a = x.nextDouble();
		System.out.println("Please enter the B value");
		double b = x.nextDouble();
		System.out.println("Please enter the C value.");
		double c = x.nextDouble();
		
		double discriminant = (b*b)-4*a*c;
		
		System.out.println("Plus = "+(-b+Math.sqrt(discriminant))/(2*a));
		System.out.println("Minus = "+(-b-Math.sqrt(discriminant))/(2*a));
		
		
	}

}
