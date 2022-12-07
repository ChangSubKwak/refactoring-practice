package solution._3_replace_method_with_method_object._1;

public class MethodObject {

	private ReplaceMethodWithMethodObject1 replaceMethodWithMethodObject1;

	private int one = 1;
	private int two = 2;
	private int three = 3;
	private int four = 4;
	private int five = 5;
	private int seven;

	public MethodObject(ReplaceMethodWithMethodObject1 replaceMethodWithMethodObject1, int seven) {
		this.replaceMethodWithMethodObject1 = replaceMethodWithMethodObject1;
		this.seven = seven;
	}

	public void manyTempVariablesExist() {
		printNumber();
		printCalculationResult();
	}

	private void printCalculationResult() {
		System.out.println("sum = " + getSum());
		System.out.println("average = " + getAverage());
		System.out.println("variation = " + getVariation());
	}

	private int getVariation() {
		int variation = (int)(Math.pow(one - getAverage(), 2) + Math.pow(two - getAverage(), 2) + Math.pow(three - getAverage(), 2) +
				Math.pow(four - getAverage(), 2) + Math.pow(five - getAverage(), 2) + Math.pow(replaceMethodWithMethodObject1.getSix() - getAverage(), 2) +
				Math.pow(seven - getAverage(), 2));
		return variation;
	}

	private int getAverage() {
		int average = getSum() / 7;
		return average;
	}

	private int getSum() {
		return one + two + three + four + five + replaceMethodWithMethodObject1.getSix() + seven;
	}

	private void printNumber() {
		System.out.println("one = " + one);
		System.out.println("two = " + two);
		System.out.println("three = " + three);
		System.out.println("four = " + four);
		System.out.println("five = " + five);
		System.out.println("six = " + replaceMethodWithMethodObject1.getSix());
		System.out.println("seven = " + seven);
	}
}
