package problem._2_replace_temp_with_query;

import java.util.List;

public class ReplaceTempWithQuery {
    private String name;
    private List<Double> amounts;

    private ReplaceTempWithQuery(String name, List<Double> amounts) {
        this.name = name;
        this.amounts = amounts;
    }

    public static ReplaceTempWithQuery of(String name, List<Double> amounts) {
        return new ReplaceTempWithQuery(name, amounts);
    }

    public void printOwing() {
        double outstanding1 = 0.0;
        double outstanding2 = 0.0;
        double outstanding3 = 0.0;
        double outstanding4 = 0.0;

        for (Double amount : amounts) {
            outstanding1 += amount;
            outstanding2 += amount * 2;
            outstanding3 += amount * 3;
        }
        outstanding4 += outstanding1 + outstanding2 + outstanding3;

        System.out.println("name : " + name);
        System.out.println("amount1 : " + outstanding1);
        System.out.println("amount2 : " + outstanding2);
        System.out.println("amount3 : " + outstanding3);
        System.out.println("amount4 : " + outstanding4);
    }

}
