package solution._5_pull_up_field;

public class Salesman extends Employee {
    public Salesman(String name) {
        super.name = name;
    }

    public String getName() {
   		return super.name;
    }
}
