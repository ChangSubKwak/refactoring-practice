package solution._8_extract_class;

import java.util.Objects;

public class Person {

    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    private String name;

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.telephoneNumber.setAreaCode(officeAreaCode);
        this.telephoneNumber.setNumber(officeNumber);
    }

    public String getName() {
        return name;
    }

    public String getOfficeNumber() {
        return telephoneNumber.getNumber();
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getAreaCode();
    }

}
