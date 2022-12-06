package solution._2_replace_temp_with_query;

public class ReplaceTempWithQuery2 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery2(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    //TODO : 임시변수에 값이 여러번 대입되는 케이스
    // 메소드설명 : 임시변수에 값이 두 번 할당되는 케이스를 만든 것
    public double getPrice() {
        int basePrice = quantity * itemPrice;           // basePrice에 첫번째 대입

        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;

        basePrice = itemPrice * 2;                      // basePrice에 두번째 대입

        return basePrice * discountFactor;
    }

}
