package solution._2_replace_temp_with_query;

public class ReplaceTempWithQuery1 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery1(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        return basePrice() * discountFactor();
    }

    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        }
        return 0.98;
    }

    private int basePrice() {
        return quantity * itemPrice;
    }

}
