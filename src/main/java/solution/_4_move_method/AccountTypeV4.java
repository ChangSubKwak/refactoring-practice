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
}
