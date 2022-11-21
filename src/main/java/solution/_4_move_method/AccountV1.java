package solution._4_move_method;

public class AccountV1 {

    private AccountTypeV1 accountTypeV1;

    private AccountV1(AccountTypeV1 accountTypeV1) {
        this.accountTypeV1 = accountTypeV1;
    }

    public static AccountV1 of(AccountTypeV1 accountTypeV1) {
        return new AccountV1(accountTypeV1);
    }

    private double bankCharge()  {
        double result = 4.5;
        if (daysOverdrawn() > 0) {
            result += accountTypeV1.overdraftCharge();
        }
        return result;
    }

    private int daysOverdrawn() {
        return accountTypeV1.daysOverdrawn();
    }
}
