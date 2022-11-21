package problem._4_move_method;

public class Account {

    private int daysOverdrawn;
    private AccountType accountType;

    private Account(int daysOverdrawn, AccountType accountType) {
        this.daysOverdrawn = daysOverdrawn;
        this.accountType = accountType;
    }

    public static Account of(int daysOverdrawn, AccountType accountType) {
        return new Account(daysOverdrawn, accountType);
    }

    // overdraftCharge 를 AccountType로 Move Method 하는 방법 4가지
    // 1. daysOverdrawn 변수를 AccountType의 필드로 만들기
    // 2. AccountType에 Account 객체를 포함하기
    // 3. overdraftCharge 메소드에 Account 객체를 파라미터로 넘기기
    // 4. overdraftCharge 메소드에 daysOverdrawn 변수를 파라미터로 넘기기

    // 무엇이 좋을까?

    private double overdraftCharge() {
        if (accountType.isPremium()) {
            final int baseCharge = 10;
            if (daysOverdrawn <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (daysOverdrawn - 7) * 0.85;
            }
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    private double bankCharge()  {
        double result = 4.5;
        if (daysOverdrawn() > 0) {
            result += overdraftCharge();
        }
        return result;
    }

    private int daysOverdrawn() {
            return daysOverdrawn;
        }
}
