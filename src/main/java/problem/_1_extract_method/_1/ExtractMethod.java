package problem._1_extract_method._1;

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

    //TODO : 다음의 함수를 Extract Method(메소드추출법)을 이용하여 3개의 의미 있는 메소드로 나누어서 리팩토링 해보세요.
    // * IDE의 기능을 사용하지 않고 시도해보세요.
    // 1. 테스트 코드 작성 (제공)
    // 2. 뽑아낼 코드에 대한 메소드에 대한 의미있는 이름 만들기
    //    - A - 지역 변수 없는 경우 : ex) print~~
    //    - B - 지역 변수에 다른 값을 여러 번 대입하는 경우 ex) get~~, create~~, generate~~
    //    - C - 지역 변수가 포함되어 있는 경우 : 의미있는 이름 고민해보기  ex) print~~
    // 3. 뽑아 낸 코드를 복사하여 붙여넣기
    // 4. 뽑아 낸 코드 내부 지역 변수의 존재 및 쓰임에 따라 다음과 같이 작성
    //    - A - 지역 변수 없는 경우 : 반환값 void, 인자없는 메소드로 만들기
    //    - B - 지역 변수 존재하면서 쓰는 경우 : 반환값 지역변수 타입(double), 인자는 지역변수를 받도록 메소드 만들기
    //    - C - 지역 변수 존재하나 읽기만 하는 경우 : 반환값 void, 인자는 지역변수를 받도록 메소드 만들기
    // 5. 필요에 따라 새롭게 만든 메소드내 지역변수를 의미에 맞게 네이밍하기
    // 6. 기존 코드를 새롭게 만든 메소드로 대체
    // 7. 지역변수 대신 메소드 대체 하기
    // 8. 미사용 지역변수 삭제
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
