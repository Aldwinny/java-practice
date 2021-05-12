
public class Car {
	String model;

	Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void copy(Car x) {
		this.setModel(x.getModel());
	}
}
