package solution._3_replace_method_with_method_object._1;

public class Gamma {
	private final ReplaceMethodWithMethodObject account;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantValue1;
	private int importantValue2;
	private int importantValue3;

	public Gamma(ReplaceMethodWithMethodObject account, int inputVal, int quantity, int yearToDate) {
		this.account = account;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
		this.importantValue1 = (inputVal * quantity) + account.delta();
		this.importantValue2 = (inputVal * yearToDate) + 100;
		this.importantValue3 = importantThing() * 7;
	}

	public int compute() {
		return importantValue3 - 2 * importantValue1;
	}

	private int importantThing() {
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		return importantValue2;
	}
}
