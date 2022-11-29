package problem._6_pull_up_method;

public class RegularCustomer extends Customer {
    public String createBill(String date) {
        return "call createBill : " + date;
    }

    public void changeFor(String start, String end) {
        System.out.println("RegularCustomer class" + " start : " + start + " end : " + end);
    }
}
