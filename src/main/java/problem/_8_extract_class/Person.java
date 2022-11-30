package problem._8_extract_class;

//TODO :두 개의 클래스가 해야 할 일을 하나의 클래스가 하고 있는 경우
// 1. Person 클래스가 이름과 전화번호 정보를 가지고 있는 것이 설계상 문제될 경우 분리하기
//    - 만약 집전화번호가 필요해서 homeAreaCode, homeNumber를 추가하면 이는 전화번호와 관련된 내용만 추가되는 것
//    - 앞으로 전화번호의 종류가 추가될 예정 - 별장전화번호, 휴양지 전화번호, 제2오피스 전화번호 등..
//    - 이럴 경우 Person의 name과는 전혀 관련없는 부분이 추가되는 것임
//    - 관련된 부분만 변경할 수 있도록 클래스(TelephoneNumber)를 별도로 추출(Extract Class)하여 의존성 제거가 필요
// 2. Person 클래스 내에서 전화번호와 관련 부분 인지
//    - officeAreaCode, officeNumber 필드가 전화번호와 관련된 부분
// 3. TelephoneNumber(전화번호) 클래스를 생성하기
// 4. TelephoneNumber내에 2번에서 인지된 필드 추가하고 일반화된 이름으로 Rename
//    ex) officeAreaCode --> areaCode
//    - getter 생성 (나중에 생성해도 무방)
// 5. Person 클래스 내, TelephoneNumber 클래스 객체 선언
// 6. Person 클래스 메소드 내, 전화번호 관련 필드를 사용하는 부분을 TelephoneNumber 객체 변수를 사용하여 접근하도록 변경
//    - 필요에 따라 TelephoneNumber 내부에 getter, setter 생성
// 7. Person 클래스 메소드 내, 전화번호 관련 필드 제거
public class Person {

    private String name;

    private String officeAreaCode;

    private String officeNumber;

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

}
