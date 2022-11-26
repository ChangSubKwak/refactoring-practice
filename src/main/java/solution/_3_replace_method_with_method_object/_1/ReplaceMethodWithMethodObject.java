package solution._3_replace_method_with_method_object._1;

public class ReplaceMethodWithMethodObject {
	private int delta;

	public ReplaceMethodWithMethodObject(int delta) {
		this.delta = delta;
	}

	public int gamma(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}

	public int delta() {
		return delta;
	}

}
