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

    //TODO : 다음의 메소드를 Extract Method(메소드추출법)을 이용하여 3개의 의미 있는 메소드로 나누어서 리팩토링 해보세요.
    // 메소드설명 : 고객이 미지불한 부채 금액을 계산하여 이름과 부채 총량을 출력하는 기능을 수행
    public void printOwing() {
        // A - 지역 변수 없는 경우
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");

        // B - 지역 변수에 다른 값을 여러 번 대입하는 경우
        double outstanding = 0.0;
        for (Double amount : amounts) {
            outstanding += amount;
        }

        // C - 지역 변수가 포함되어 있는 경우
        System.out.println("name : " + name);
        System.out.println("amount : " + outstanding);
    }
}
