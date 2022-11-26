package problem._2_replace_temp_with_query;

public class ReplaceTempWithQuery1 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery1(int quantity, int itemPrice) {
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

}
