package solution._6_pull_up_method;

public class PreferredCustomer extends Customer {
    public String createBill(String date) {
        return "call createBill : " + date;
    }

    public void changeFor(String start, String end) {
        System.out.println("PreferredCustomer class" + " start : " + start + " end : " + end);
    }
}
