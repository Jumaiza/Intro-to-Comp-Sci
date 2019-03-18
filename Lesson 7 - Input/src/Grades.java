import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner y = new Scanner(System.in);
		System.out.println("Test 1 grade?");
		int test1 = y.nextInt();
		System.out.println("Test 2 grade?");
		int test2 = y.nextInt();
		System.out.println("Test 3 grade?");
		int test3 = y.nextInt();
		System.out.println("average : "+(test1+test2+test3)/3);
		
		
	}

}
