package solution._4_move_method;

public class AccountTypeV3 {
    private  boolean premium;

    private AccountTypeV3(boolean premium) {
        this.premium = premium;
    }

    public static AccountTypeV3 from(boolean premium) {
        return new AccountTypeV3(premium);
    }

    public boolean isPremium() {
        return premium;
    }

    // 3. 메소드에 소스 객체를 파라미터로 넘긴다.
    public double overdraftCharge(AccountV3 accountV3) {
        if (isPremium()) {
            final int baseCharge = 10;
            if (accountV3.daysOverdrawn() <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (accountV3.daysOverdrawn() - 7) * 0.85;
            }
        } else {
            return accountV3.daysOverdrawn() * 1.75;
        }
    }
}
