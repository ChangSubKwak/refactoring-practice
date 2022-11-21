package solution._4_move_method;

public class AccountV4 {

    private int daysOverdrawn;
    private AccountTypeV4 accountTypeV4;

    private AccountV4(int daysOverdrawn, AccountTypeV4 accountTypeV4) {
        this.daysOverdrawn = daysOverdrawn;
        this.accountTypeV4 = accountTypeV4;
    }

    public static AccountV4 of(int daysOverdrawn, AccountTypeV4 accountTypeV4) {
        return new AccountV4(daysOverdrawn, accountTypeV4);
    }

    private double bankCharge()  {
        double result = 4.5;
        if (daysOverdrawn() > 0) {
            result += accountTypeV4.overdraftCharge(daysOverdrawn);
        }
        return result;
    }

    private int daysOverdrawn() {
            return daysOverdrawn;
        }
}
