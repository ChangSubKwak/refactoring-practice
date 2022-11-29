package solution._5_pull_up_field;

public class Engineer extends Employee {
    public Engineer(String name) {
        super.name = name;
    }

    public String getName() {
   		return super.name;
    }
}
