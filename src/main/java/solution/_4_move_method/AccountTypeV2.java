package solution._4_move_method;

public class AccountTypeV2 {
    private  boolean premium;

    private int daysOverdrawn;

    private AccountTypeV2(boolean premium) {
        this.premium = premium;
    }

    public static AccountTypeV2 from(boolean premium) {
        return new AccountTypeV2(premium);
    }

    public AccountTypeV2(boolean premium, int daysOverdrawn) {
        this.premium = premium;
        this.daysOverdrawn = daysOverdrawn;
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
        }
        return daysOverdrawn * 1.75;
    }
}
