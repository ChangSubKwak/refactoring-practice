package solution._3_replace_method_with_method_object._2;


public class MethodObject {
    private ReplaceMethodWithMethodObject2 source;

    private double input1;
    private double input2;
    private double input3;

    private MethodObject(ReplaceMethodWithMethodObject2 source, double input1, double input2, double input3) {
        this.source = source;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public static MethodObject of(ReplaceMethodWithMethodObject2 source, double input1, double input2, double input3) {
        return new MethodObject(source, input1, input2, input3);
    }

    public void printOwing() {
        System.out.println("name : " + source.getName());
        System.out.println("amount1 : " + getOutstanding1());
        System.out.println("amount2 : " + getOutstanding2());
        System.out.println("amount3 : " + getOutstanding3());
        System.out.println("amount4 : " + getOutstanding4());
    }

    private double getOutstanding1() {
        double result = 0.0;
        for (Double amount : source.getAmounts()) {
            result += input1 + amount;
        }
        return result;
    }

    private double getOutstanding2() {
        double result = 0.0;
        for (Double amount : source.getAmounts()) {
            result += input2 + amount * 2;
        }
        return result;
    }

    private double getOutstanding3() {
        double result = 0.0;
        for (Double amount : source.getAmounts()) {
            result += input3 + amount * 3;
        }
        return result;
    }

    private double getOutstanding4() {
        return getOutstanding1() + getOutstanding2() + getOutstanding3();
    }
}
