package problem._2_replace_temp_with_query;

public class ReplaceTempWithQuery2 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery2(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        // 임시변수에 값이 한번만 대입되는지 확인 후, 여러 번 대입되는 경우 Split Temporary Variable을 먼저 시도한다.
        // Split Temporary Variable(변수쪼개기) 는 또다른 임시변수를 선언하는 것
        // 이유 : 코드를 읽는 이에게 커다른 혼란을 주기 때문이다.
        int basePrice = quantity * itemPrice;

        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;

        basePrice = itemPrice * 2;

        return basePrice * discountFactor;
    }
}
