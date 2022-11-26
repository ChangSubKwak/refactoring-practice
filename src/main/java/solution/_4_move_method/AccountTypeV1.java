package solution._4_move_method;

public class AccountTypeV1 {
    private  boolean premium;

    private int daysOverdrawn;

    private AccountTypeV1(boolean premium, int daysOverdrawn) {
        this.premium = premium;
        this.daysOverdrawn = daysOverdrawn;
    }

    public static AccountTypeV1 of(boolean premium, int daysOverdrawn) {
        return new AccountTypeV1(premium, daysOverdrawn);
    }

    public boolean isPremium() {
        return premium;
    }

    public double overdraftCharge() {
        if (isPremium()) {
            final int baseCharge = 10;
            if (daysOverdrawn <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (daysOverdrawn - 7) * 0.85;
            }
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    public int daysOverdrawn() {
        return daysOverdrawn;
    }
}
