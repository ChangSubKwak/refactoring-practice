package solution._2_replace_temp_with_query;

public class ReplaceTempWithQuery4 {
    private int quantity;
    private int itemPrice;

    public ReplaceTempWithQuery4(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        return getBasePrice() * getDiscountFactor();
    }

    public double increaseQuantityAndDecreaseItemPriceAndGetPrice() {
        increaseQuantity();
        decreaseItemPrice();
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

}
