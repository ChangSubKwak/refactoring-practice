package problem._2_replace_temp_with_query;

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

    //TODO : 메소드 추출할 때 지역변수가 두 개 이상일 경우 리팩토링 해보기
    // 메소드설명 : 지역변수가 여러개 존재하고 변경되는 케이스를 만든 것 (ReplaceTempWithQuery3 과 동일)
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
