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
}
