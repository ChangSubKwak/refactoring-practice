package solution._8_extract_class;

// 두 개의 클래스가 해야 할 일을 하나의 클래스가 하고 있는 경우
// TelephoneNumber 클래스를 만들고 officeAreaCode, officeNumber을 옮겨보기 (Move Method 이용)
public class Person {

    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    private String name;

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return "(" + getOfficeAreaCode() + ")" + getOfficeNumber();
    }

    public String getOfficeNumber() {
        return telephoneNumber.getOfficeNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        telephoneNumber.setOfficeNumber(officeNumber);
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getOfficeAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        telephoneNumber.setOfficeAreaCode(officeAreaCode);
    }
}
