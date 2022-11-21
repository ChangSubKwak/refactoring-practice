package solution._3_replace_method_with_method_object;

import java.util.List;

public class ReplaceMethodWithMethodObject {
    private String name;
    private List<Double> amounts;

    private ReplaceMethodWithMethodObject(String name, List<Double> amounts) {
        this.name = name;
        this.amounts = amounts;
    }

    public static ReplaceMethodWithMethodObject of(String name, List<Double> amounts) {
        return new ReplaceMethodWithMethodObject(name, amounts);
    }

    public void printOwingOriginal(double input1, double input2, double input3) {
        double outstanding1 = 0.0;
        double outstanding2 = 0.0;
        double outstanding3 = 0.0;
        double outstanding4 = 0.0;

        for (Double amount : amounts) {
            outstanding1 += input1 + amount;
            outstanding2 += input2 + amount * 2;
            outstanding3 += input3 + amount * 3;
        }
        outstanding4 += outstanding1 + outstanding2 + outstanding3;

        System.out.println("name : " + name);
        System.out.println("amount1 : " + outstanding1);
        System.out.println("amount2 : " + outstanding2);
        System.out.println("amount3 : " + outstanding3);
        System.out.println("amount4 : " + outstanding4);
    }

    // As a result of "ReplaceTempWithQuery"
    public void printOwingOriginal2(double input1, double input2, double input3) {
        System.out.println("name : " + name);
        System.out.println("amount1 : " + getOutstanding1(input1));
        System.out.println("amount2 : " + getOutstanding2(input2));
        System.out.println("amount3 : " + getOutstanding3(input3));
        System.out.println("amount4 : " + getOutstanding4(input1, input2, input3));
    }

    private double getOutstanding1(double input1) {
        double result = 0.0;
        for (Double amount : amounts) {
            result += input1 + amount;
        }
        return result;
    }

    private double getOutstanding2(double input2) {
        double result = 0.0;
        for (Double amount : amounts) {
            result += input2 + amount * 2;
        }
        return result;
    }

    private double getOutstanding3(double input3) {
        double result = 0.0;
        for (Double amount : amounts) {
            result += input3 + amount * 3;
        }
        return result;
    }

    private double getOutstanding4(double input1, double input2, double input3) {
        return getOutstanding1(input1) + getOutstanding2(input2) + getOutstanding3(input3);
    }

    private MethodObject methodObject;

    public void printOwing(double input1, double input2, double input3) {
        methodObject = MethodObject.of(this, input1, input2, input3);
        System.out.println("name : " + name);
        System.out.println("amount1 : " + methodObject.getOutstanding1());
        System.out.println("amount2 : " + methodObject.getOutstanding2());
        System.out.println("amount3 : " + methodObject.getOutstanding3());
        System.out.println("amount4 : " + methodObject.getOutstanding4());
    }

    public List<Double> getAmounts() {
        return amounts;
    }

}
