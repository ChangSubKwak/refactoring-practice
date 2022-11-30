package solution._6_pull_up_method;

//TODO: 동일한 일을 하는 메소드를 여러 서브클래스에서 가지고 있다면, 이메소드를 수퍼클래스로 옮겨라
// 1. RegularCustomer 클래스와 PreferredCustomer 클래스에서 동일한 기능을 하는 createBill 메소드를 확인
// 2. RegularCustomer 클래스 또는 PreferredCustomer 클래스에서 createBill를 복사하여 부모클래스인 Customer로 붙여넣기
// 3. RegularCustomer 클래스 또는 PreferredCustomer 클래스에서 createBill를 제거하기
public class Customer {
    public void addBill(String date, Double bill) {
        System.out.println("call addBill : " + date + ", " + bill);
    }

    public void lastBillDate() {
        System.out.println("call lastBillDate");
    }
}
