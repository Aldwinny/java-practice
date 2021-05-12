package cake;

public class StrawberryCake extends Cake {
	@Override
	public String flavor() {
		return "Strawberry";
	}
	
	@Override
	public String taste() {
		return super.taste[0];
	}
}
