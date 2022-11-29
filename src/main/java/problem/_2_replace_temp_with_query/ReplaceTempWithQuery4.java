package problem._2_replace_temp_with_query;

public class ReplaceTempWithQuery4 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery4(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    //TODO: 부수효과(side effect) 발생부분 분리하기
    // https://en.wikipedia.org/wiki/Pure_function
    // 개념 : 함수내에서 비지역변수, 정적변수, 참조변수 수정시 --> 부수효과 있다고 함
    // 체크사항
    // - 부수효과는 질의(읽는)함수와 분리해야만 함
    // - 그 이유는 신경 쓸 거리가 적어지게 됨 (By 마틴 파울러)
    // - 분리시, 테스트도 편하며, 질의함수끼리의 호출순서를 신경쓰지 않아도 되며, 병렬처리시 동기화 생각안해도 됨 (By 마틴 파울러)
    // - 부수효과는 값 변경을 위해 존재할 수 밖에 없으며, 이를 식별하여 코드 전체에 분산되지 않도록 하는 것이 중요
    // 1. 테스트 코드 작성 - ReplaceTempWithQuery1Test의 getPrice 메소드를 테스트하는 코드를 그대로 사용해도 무방
    // 2. Separate Query from Modifier 를 이용하여 아래의 메소드를 순수함수(메소드)로 만들어 보기
    // 3. ReplaceTempWithQuery1에서 정의된 getPrice메소드와 동일한 기능을 가지도록 메소드 분리해보기

    public double increaseQuantityAndDecreaseItemPriceAndGetPrice() {
        quantity++;
        itemPrice -= 100;
        int basePrice = quantity * itemPrice;

        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;

        return basePrice * discountFactor;
    }

}
