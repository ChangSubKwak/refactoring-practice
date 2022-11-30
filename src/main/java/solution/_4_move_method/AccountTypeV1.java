package solution._4_move_method;

public class AccountTypeV1 {
    private  boolean premium;

    private AccountTypeV1(boolean premium) {
        this.premium = premium;
    }

    public static AccountTypeV1 from(boolean premium) {
        return new AccountTypeV1(premium);
    }

    public boolean isPremium() {
        return premium;
    }
}
