package iceCream;

public class mangoIceCream extends IceCream {
	@Override
	public String flavor() {
		return "Mango";
	}
	
	@Override
	public String taste() {
		return super.taste[0];
	}
}
