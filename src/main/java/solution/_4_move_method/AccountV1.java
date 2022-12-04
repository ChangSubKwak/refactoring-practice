package solution._4_move_method;

public class AccountV1 {

    private int daysOverdrawn;
    private AccountTypeV1 accountTypeV1;

    private AccountV1(int daysOverdrawn, AccountTypeV1 accountTypeV1) {
        this.daysOverdrawn = daysOverdrawn;
        this.accountTypeV1 = AccountTypeV1.of(accountTypeV1.isPremium(), daysOverdrawn);
    }

    public static AccountV1 of(int daysOverdrawn, AccountTypeV1 accountTypeV1) {
        return new AccountV1(daysOverdrawn, accountTypeV1);
    }

    public double bankCharge()  {
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
