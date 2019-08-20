
public class Trail {

	int x, y;
	String s;
	
	public Trail(String s) {
		this.s = s;
		x = 10;
		y = 10;
	}
	public String met() {
		return Integer.toString(x*y);
	}

}
