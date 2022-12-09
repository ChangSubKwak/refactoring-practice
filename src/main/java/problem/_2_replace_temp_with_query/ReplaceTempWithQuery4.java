package problem._2_replace_temp_with_query;

public class ReplaceTempWithQuery4 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery4(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    //TODO: 부수효과(side effect) 발생부분 분리하기
    // 참고 : https://en.wikipedia.org/wiki/Pure_function
    // 메소드설명 : 부수효과 발생 케이스를 만든 것
    public double getPrice() {
        int basePrice = quantity * itemPrice;
        quantity++;             // 함수내 지역변수가 아닌 다른 변수 변경시 부수효과 발생 #1
        itemPrice -= 100;       // 두번째 부수효과 발생 #2
        basePrice = quantity * itemPrice;

        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;

        return basePrice * discountFactor;
    }

}
