
public class exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 0; j<=127; j++) {
			char ch = (char)j;
			if (Character.isWhitespace(ch))
				System.out.println(j);
		}
	}

}
