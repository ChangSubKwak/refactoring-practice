package solution._3_replace_method_with_method_object._2;

import java.util.List;

public class ReplaceMethodWithMethodObject2 {
    private String name;
    private List<Double> amounts;

    private ReplaceMethodWithMethodObject2(String name, List<Double> amounts) {
        this.name = name;
        this.amounts = amounts;
    }

    public static ReplaceMethodWithMethodObject2 of(String name, List<Double> amounts) {
        return new ReplaceMethodWithMethodObject2(name, amounts);
    }

    //TODO: 다음의 메소드를 메소드 객체로 전환하기(1판 - Replace Method with Method Object, 2판 - Replace Function with Command)
    // 참고) 다음 예제는 ReplaceTempWithQuery3 과 동일한 코드이며, 리팩터링 방법에 따라 결과가 어떻게 다른지 비교해보기
    public void printOwing(double input1, double input2, double input3) {
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

}
