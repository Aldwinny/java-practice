package cake;

public class OrangeCake extends Cake {
	@Override
	public String flavor() {
		return "Orange";
	}
	
	@Override
	public String taste() {
		return super.taste[2];
	}
}
