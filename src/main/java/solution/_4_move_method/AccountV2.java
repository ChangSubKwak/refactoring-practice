package solution._4_move_method;

public class AccountV2 {

    private int daysOverdrawn;
    private AccountTypeV2 accountType;

    private AccountV2(int daysOverdrawn, AccountTypeV2 accountType) {
        this.daysOverdrawn = daysOverdrawn;
        this.accountType = accountType;
    }

    public static AccountV2 of(int daysOverdrawn, AccountTypeV2 accountType) {
        return new AccountV2(daysOverdrawn, accountType);
    }

    //TODO
    // - overdraftCharge 를 AccountType로 Move Method 하면 accountType과 daysOverdrawan 변수를 얻어야 함
    // - 이에 대한 처리 방법으로 4가지가 존재
    // 1. daysOverdrawn 변수를 AccountType의 필드로 만들기
    // 2. AccountType에 Account 객체를 포함하기
    // 3. overdraftCharge 메소드에 Account 객체를 파라미터로 넘기기
    // 4. overdraftCharge 메소드에 daysOverdrawn 변수를 파라미터로 넘기기
    // 무엇이 좋을지 고민해보기

    //TODO: 1. daysOverdrawn 변수를 AccountType의 필드로 만들기
    // 1-1. bankCharge메소드에 대한 테스트 케이스를 작성
    // 1-2. overdraftCharge 메소드를 통으로 AccountType로 옮기기
    // 1-3. AccountType클래스에 daysOverdrawn 필드를 선언하기
    // 1-4. AccountType클래스 생성자를 추가(변경)하기
    // 1-5. AccountType클래스의 overdraftCharge 메소드 내 AccountType 객체를 접근하는 부분 제거하기
    // 1-6. Account클래스의 bankCharge 메소드 내, overdraftCharge 메소드가 AccountType필드를 통해 호출되도록 하기

    //TODO: 2. AccountType에 Account 객체를 포함하기
    // 2-1. 순환참조로 패스

    //TODO: 3. overdraftCharge 메소드에 Account 객체를 파라미터로 넘기기
    // 3-1. bankCharge메소드에 대한 테스트 케이스를 작성
    // 3-2. overdraftCharge 메소드를 통으로 AccountType로 옮기기
    // 3-3. overdraftCharge 메소드의 인자에 Account 클래스 변수 추가
    // 3-4. AccountType클래스의 overdraftCharge 메소드 내 AccountType 객체를 접근 부분 제거
    // 3-5. AccountType클래스의 overdraftCharge 메소드 내 daysOverdrawn 변수에 Account 객체 접근하도록 수정

    //TODO: 4. overdraftCharge 메소드에 daysOverdrawn 변수를 파라미터로 넘기기
    // 4-1. bankCharge메소드에 대한 테스트 케이스를 작성
    // 4-2. overdraftCharge 메소드를 통으로 AccountType로 옮기기
    // 4-3. overdraftCharge 메소드의 인자에 daysOverdrawn 변수 추가
    // 4-4. AccountType클래스의 overdraftCharge 메소드 내 AccountType 객체를 접근 부분 제거

    public double overdraftCharge() {
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


    public double bankCharge()  {
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
