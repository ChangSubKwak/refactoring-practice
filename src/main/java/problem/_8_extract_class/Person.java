package problem._8_extract_class;

// 두 개의 클래스가 해야 할 일을 하나의 클래스가 하고 있는 경우
// TelephoneNumber 클래스를 만들고 officeAreaCode, officeNumber을 옮겨보기 (Move Method 이용)
public class Person {

    private String name;

    private String officeAreaCode;

    private String officeNumber;

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ")" + officeNumber;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
