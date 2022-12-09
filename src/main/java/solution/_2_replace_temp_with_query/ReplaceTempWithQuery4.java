package solution._2_replace_temp_with_query;

public class ReplaceTempWithQuery4 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery4(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double increaseQuantityAndDecreaseItemPriceAndGetPrice() {
        int basePrice = quantity * itemPrice;
        quantity++;
        itemPrice -= 100;
        basePrice = quantity * itemPrice;

        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;

        return basePrice * discountFactor;
    }

    public double getPrice() {
        return getBasePrice() * getDiscountFactor();
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }

    private double getDiscountFactor() {
        if (getBasePrice() > 1000) {
            return 0.95;
        }
        return 0.98;
    }

    private void increaseQuantity() {
        quantity++;
    }

    private void decreaseItemPrice() {
        itemPrice -= 100;
    }

    public static void main(String[] args) {
        ReplaceTempWithQuery4 replaceTempWithQuery4 = new ReplaceTempWithQuery4(1, 500);
        int basePrice = replaceTempWithQuery4.getBasePrice();
        replaceTempWithQuery4.increaseQuantity();
        replaceTempWithQuery4.decreaseItemPrice();
        basePrice = replaceTempWithQuery4.getBasePrice();
    }

}
