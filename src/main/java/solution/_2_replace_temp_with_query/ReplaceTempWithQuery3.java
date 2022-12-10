package solution._2_replace_temp_with_query;

import java.util.Arrays;
import java.util.List;

public class ReplaceTempWithQuery3 {
    private String name;
    private List<Double> amounts;

    private ReplaceTempWithQuery3(String name, List<Double> amounts) {
        this.name = name;
        this.amounts = amounts;
    }

    public static ReplaceTempWithQuery3 of(String name, List<Double> amounts) {
        return new ReplaceTempWithQuery3(name, amounts);
    }

    public void printOwing() {
        System.out.println("name : " + name);
        System.out.println("amount1 : " + getOutstanding1());
        System.out.println("amount2 : " + getOutstanding2());
        System.out.println("amount3 : " + getOutstanding3());
        System.out.println("amount4 : " + getOutstanding4());
    }

    private double getOutstanding1() {
        double result = 0.0;
        for (Double amount : amounts) {
            result += amount;
        }
        return result;
    }

    private double getOutstanding2() {
        double result = 0.0;
        for (Double amount : amounts) {
            result += amount * 2;
        }
        return result;
    }

    private double getOutstanding3() {
        double result = 0.0;
        for (Double amount : amounts) {
            result += amount * 3;
        }
        return result;
    }

    private double getOutstanding4() {
        return getOutstanding1() + getOutstanding2() + getOutstanding3();
    }
}
