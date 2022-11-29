package problem._2_replace_temp_with_query;

public class ReplaceTempWithQuery1 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery1(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    //TODO: 다음 getPrice 메소드 내부를 Replace Temp with Query(임시 변수를 질의 함수로 바꾸기) - 큰 범위에서 보면 메소드 추출
    // 1. getPrice메소드에 대해 테스트 케이스 작성
    // 2. Extract Method 를 이용하여 아래 메소드를 2개의 메소드로 구성되도록 리팩토링
    // 3. Extract Method 절차가 기억나지 않으면 _1_extract_method의 ExtractMethod 클래스의 TODO를 참고
    public double getPrice() {
        int basePrice = quantity * itemPrice;

        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;

        return basePrice * discountFactor;
    }

}
