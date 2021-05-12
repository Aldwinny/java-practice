package iceCream;

public class StrawberryIceCream extends IceCream {
	@Override
	public String flavor() {
		return "Strawberry";
	}
	
	@Override
	public String taste() {
		return super.taste[0];
	}
}
