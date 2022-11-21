package problem._6_pull_up_method;

public class Customer {
    public void addBill(String date, Double bill) {
        System.out.println("call addBill : " + date + ", " + bill);
    }

    public void lastBillDate() {
        System.out.println("call lastBillDate");
    }
}
