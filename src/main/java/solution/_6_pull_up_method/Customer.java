package solution._6_pull_up_method;

public abstract class Customer {
    public void addBill(String date, Double bill) {
        System.out.println("call addBill : " + date + ", " + bill);
    }

    public String createBill(String date) {
        return "call createBill : " + date;
    }

    public abstract void changeFor(String start, String end);

    public void lastBillDate() {
        System.out.println("call lastBillDate");
    }
}
