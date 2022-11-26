package solution._2_replace_temp_with_query;

public class ReplaceTempWithQuery2 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery2(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        return getTwoItemPrice() * getDiscountFactor();
    }

    private double getDiscountFactor() {
        double discountFactor;
        if (getBasePrice() > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;
        return discountFactor;
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }

    private int getTwoItemPrice() {
        return itemPrice * 2;
    }

}
