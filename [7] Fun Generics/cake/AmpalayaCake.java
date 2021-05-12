package cake;

public class AmpalayaCake extends Cake{
	@Override
	public String flavor() {
		return "Ampalaya";
	}
	
	@Override
	public String taste() {
		return super.taste[1];
	}
}
