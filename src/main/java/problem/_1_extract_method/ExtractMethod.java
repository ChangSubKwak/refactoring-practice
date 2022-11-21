package problem._1_extract_method;

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

    // IDE의 기능을 사용하지 않고 시도해보기
    public void printOwing() {
        // 1 - 지역 변수 없는 경우
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");

        // 3 - 지역 변수에 다른 값을 여러 번 대입하는 경우
        double outstanding = 0.0;
        for (Double amount : amounts) {
            outstanding += amount;
        }

        // 2 - 지역 변수가 포함되어 있는 경우
        System.out.println("name : " + name);
        System.out.println("amount : " + outstanding);
    }
}
