package problem._4_move_method;

public class AccountType {
    private  boolean premium;

    private AccountType(boolean premium) {
        this.premium = premium;
    }

    public static AccountType from(boolean premium) {
        return new AccountType(premium);
    }

    public boolean isPremium() {
        return premium;
    }
}
