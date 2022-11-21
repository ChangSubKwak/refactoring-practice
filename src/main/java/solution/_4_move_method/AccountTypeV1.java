package solution._4_move_method;

public class AccountTypeV1 {
    private  boolean premium;

    private int daysOverdrawn;

    private AccountTypeV1(boolean premium) {
        this.premium = premium;
    }

    public static AccountTypeV1 from(boolean premium) {
        return new AccountTypeV1(premium);
    }

    public boolean isPremium() {
        return premium;
    }

    // 1. 이 부분 또한 타겟 클래스로 옮긴다.
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
