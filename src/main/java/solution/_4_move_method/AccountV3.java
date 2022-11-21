package solution._4_move_method;

public class AccountV3 {

    private int daysOverdrawn;
    private AccountTypeV3 accountTypeV3;

    private AccountV3(int daysOverdrawn, AccountTypeV3 accountTypeV3) {
        this.daysOverdrawn = daysOverdrawn;
        this.accountTypeV3 = accountTypeV3;
    }

    public static AccountV3 of(int daysOverdrawn, AccountTypeV3 accountTypeV3) {
        return new AccountV3(daysOverdrawn, accountTypeV3);
    }

    private double bankCharge()  {
        double result = 4.5;
        if (daysOverdrawn() > 0) {
            result += accountTypeV3.overdraftCharge(this);
        }
        return result;
    }

    public int daysOverdrawn() {
            return daysOverdrawn;
        }
}
