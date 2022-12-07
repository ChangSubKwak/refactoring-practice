package solution._3_replace_method_with_method_object._3;

public class ReplaceMethodWithMethodObject3 {
	private int delta;

	public ReplaceMethodWithMethodObject3(int delta) {
		this.delta = delta;
	}

	public int gamma(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).gamma();
	}

	public int delta() {
		return delta;
	}

}
