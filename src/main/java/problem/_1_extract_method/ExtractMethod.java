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

    //TODO : 다음의 함수를 Extract Method(함수추출법)을 이용하여 3개의 의미 있는 함수로 나누어서 리팩토링 해보세요.
    // 0. 테스트 코드 작성
    // 1. 메서드 이름 만들기
    // 2. 뽑아 낸 코드를 복사하여 붙여넣기
    // 3. 뽑아 낸 코드 내부 지역 변수 체크
    // 4. 지역변수 존재하면 매개변수 추가하기
    // 5. 변경되는 (하나의)변수가 있다면 return 을 이용하기
    // 6. 기존 코드를 새롭게 만든 메서드로 대체
    // 7. 미사용 지역변수 존재시 삭제
    // * IDE의 기능을 사용하지 않고 시도해보세요.
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
