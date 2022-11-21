package solution._3_replace_method_with_method_object;


public class MethodObject {
    ReplaceMethodWithMethodObject source;

    double input1;
    double input2;
    double input3;

    private MethodObject(ReplaceMethodWithMethodObject source, double input1, double input2, double input3) {
        this.source = source;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public static MethodObject of(ReplaceMethodWithMethodObject source, double input1, double input2, double input3) {
        return new MethodObject(source, input1, input2, input3);
    }

    public double getOutstanding1() {
        double result = 0.0;
        for (Double amount : source.getAmounts()) {
            result += input1 + amount;
        }
        return result;
    }

    public double getOutstanding2() {
        double result = 0.0;
        for (Double amount : source.getAmounts()) {
            result += input2 + amount * 2;
        }
        return result;
    }

    public double getOutstanding3() {
        double result = 0.0;
        for (Double amount : source.getAmounts()) {
            result += input3 + amount * 3;
        }
        return result;
    }

    public double getOutstanding4() {
        return getOutstanding1() + getOutstanding2() + getOutstanding3();
    }
}
