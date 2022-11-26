package problem._2_replace_temp_with_query;

public class ReplaceTempWithQuery4 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery4(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        int basePrice = quantity * itemPrice;

        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;

        return basePrice * discountFactor;
    }

    //TODO: 부수효과(side effect) 발생
    // - Separate Query of Modifier 를 이용하여 아래의 메소드를 순수함수(메소드)로 만들어 보기
    // https://en.wikipedia.org/wiki/Pure_function
    // 개념 : 함수내, 비지역변수, 정적지역변수, 참조변수 수정시 --> 부수효과 있다고 함
    // 체크사항
    // - 부수효과는 질의(읽는)함수와 분리해야만 함
    // - 그 이유는 신경 쓸 거리가 적어지게 됨 (By 마틴 파울러)
    // - 분리시, 테스트도 편하며, 질의함수끼리의 호출순서를 신경쓰지 않아도 되며, 병렬처리시 동기화 생각안해도 됨 (By 마틴 파울러)
    // - 부작용은 있어야 하며, 이를 식별하여, 코드 전체에 분산되지 않도록 해야함
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
