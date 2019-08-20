
public class Automobile {

double mpg, gallons;
	
	public Automobile(double mpg) {
		this.mpg = mpg;
		gallons = 0;
	}
	
	public void fillUp(double gallonsToAdd) {
		gallons += gallonsToAdd;
	}
	
	public void takeTrip(double miles) {
		gallons -= miles/mpg;
	}
	
	public double reportFuel() {
		return gallons;
	}

}
