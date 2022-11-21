package solution._4_move_method;

public class AccountTypeV4 {
    private  boolean premium;

    private AccountTypeV4(boolean premium) {
        this.premium = premium;
    }

    public static AccountTypeV4 from(boolean premium) {
        return new AccountTypeV4(premium);
    }

    public boolean isPremium() {
        return premium;
    }

    // 4. 사용하려는 부분이 변수라면 파라미터로 넘긴다.
    public double overdraftCharge(int daysOverdrawn) {
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
}
