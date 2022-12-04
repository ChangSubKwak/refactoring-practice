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
        System.out.println("amount1 : " + getOutstandingMultipliedBy(1));
        System.out.println("amount2 : " + getOutstandingMultipliedBy(2));
        System.out.println("amount3 : " + getOutstandingMultipliedBy(3));
        System.out.println("amount4 : " + getOutstanding4());
    }

    private double getOutstandingMultipliedBy(double multiplier) {
        return amounts.stream()
            .reduce(0.0, (x, y) -> x + y * multiplier);
    }

    private double getOutstanding4() {
        return Arrays.asList(1.0, 2.0, 3.0)
            .stream()
            .reduce(0.0, (x, y) -> x + getOutstandingMultipliedBy(y));
    }
}
