package problem._6_pull_up_method;

public class PreferredCustomer extends Customer {
    public void createBill(String date) {
        System.out.println("call createBill : " + date);
    }

    public void changeFor(String start, String end) {
        System.out.println("PreferredCustomer class" + " start : " + start + " end : " + end);
    }
}
