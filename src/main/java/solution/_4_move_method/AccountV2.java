package solution._4_move_method;

public class AccountV2 {

    private int daysOverdrawn;
    private AccountTypeV2 accountTypeV2;

    private AccountV2(int daysOverdrawn, AccountTypeV2 accountTypeV2) {
        this.daysOverdrawn = daysOverdrawn;
        this.accountTypeV2 = AccountTypeV2.of(accountTypeV2.isPremium(), this);
    }

    public static AccountV2 of(int daysOverdrawn, AccountTypeV2 accountTypeV2) {
        return new AccountV2(daysOverdrawn, accountTypeV2);
    }

    public double bankCharge()  {
        double result = 4.5;
        if (daysOverdrawn() > 0) {
            result += accountTypeV2.overdraftCharge();
        }
        return result;
    }

    public int daysOverdrawn() {
            return daysOverdrawn;
        }
}
