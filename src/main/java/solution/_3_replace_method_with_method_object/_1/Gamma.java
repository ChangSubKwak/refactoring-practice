package solution._3_replace_method_with_method_object._1;

public class Gamma {
	private final ReplaceMethodWithMethodObject1 account;

	private int inputVal;
	private int quantity;
	private int yearToDate;

	public Gamma(ReplaceMethodWithMethodObject1 account, int inputVal, int quantity, int yearToDate) {
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.account = account;
		this.yearToDate = yearToDate;
	}

	private int getImportantValue1() {
		return (inputVal * quantity) + account.delta();
	}

	private int getImportantValue2() {
		return (inputVal * yearToDate) + 100;
	}

	public int compute() {
		return getImportantValue3() * 7 - 2 * getImportantValue1();
	}

	private int getImportantValue3() {
		int result = getImportantValue2();
		if ((yearToDate - getImportantValue1()) > 100) {
			result -= 20;
		}
		return result;
	}
}
