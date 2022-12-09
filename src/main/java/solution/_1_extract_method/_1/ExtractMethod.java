package solution._1_extract_method._1;

import java.util.List;

public class ExtractMethod {
    private String name;
    private List<Double> amounts;

    private ExtractMethod(String name, List<Double> amounts) {
        this.name = name;
        this.amounts = amounts;
    }

    public static ExtractMethod of(String name, List<Double> amounts) {
        return new ExtractMethod(name, amounts);
    }

    public void printOwing() {
        printBanner();
        printDetails(getOutstanding());
    }

    private static void printBanner() {
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
    }

    private double getOutstanding() {
        double result = 0.0;
        for (Double amount : amounts) {
            result += amount;
        }
        return result;
    }

    private void printDetails(double outstanding) {
        // 2 - 지역 변수가 포함되어 있는 경우
        System.out.println("name : " + name);
        System.out.println("amount : " + outstanding);
    }
}
