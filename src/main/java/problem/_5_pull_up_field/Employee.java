package problem._5_pull_up_field;

//TODO: 두 서브클래스가 동일한 필드를 가지고 있다면, 그 필드를 수퍼클래스로 옮겨라.
// 1. 현재의 패키지의 클래스들과 Pull Up Field 했을 경우에 대한 클래스를 비교하는 테스트케이스 생성
// 2. Enginner클래스와 Salesman클래스에서 같은 필드를 확인
// 3. 같은 필드를 Employee클래스로 옮기기
// 4. Employee클래스로 옮긴 필드를 Enginner클래스와 Salesman클래스에서 필드 삭제
public abstract class Employee {
    public abstract String getName();

}
