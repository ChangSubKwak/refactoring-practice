package solution._4_move_method;

public class AccountTypeV2 {
    private  boolean premium;

    // 새로 만든 객체
    private AccountV2 accountV2;

    private AccountTypeV2(boolean premium) {
        this.premium = premium;
    }

    private AccountTypeV2(boolean premium, AccountV2 accountV2) {
        this.premium = premium;
        this.accountV2 = accountV2;
    }

    public static AccountTypeV2 from(boolean premium) {
        return new AccountTypeV2(premium);
    }

    public static AccountTypeV2 of(boolean premium, AccountV2 accountV2) {
        return new AccountTypeV2(premium, accountV2);
    }

    public boolean isPremium() {
        return premium;
    }

    // 2. 타겟 클래스에서 소스클래스를 참조하는 부분을 새로 만들거나 사용한다.
    public double overdraftCharge() {
        if (isPremium()) {
            final int baseCharge = 10;
            if (daysOverdrawn() <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (accountV2.daysOverdrawn() - 7) * 0.85;
            }
        } else {
            return accountV2.daysOverdrawn() * 1.75;
        }
    }

    private int daysOverdrawn() {
        return accountV2.daysOverdrawn();
    }
}
