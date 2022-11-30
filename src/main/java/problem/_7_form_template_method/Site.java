package problem._7_form_template_method;

//TODO: 각각의 서브클래스에, 동일한 순서로 비슷한 단계를 행하지만
//      단계가 완전히 같지 않은 두 메소드가 있다면,
//      그 단계를 동일한 시그니처를 가진 메소드로 만들어라.
//      이렇게 하면 원래의 두 메소드는 서로 같아지므로, 수퍼클래스로 올릴 수 있다.
// 1. LifelineSite 클래스와 ResidentialSite 클래스의 공통된 부분과 다른 부분을 찾는다
// 2. getBillableAmount메소드내 같은 타입과 같은 이름의 지역변수 base, tax를 사용하고 있음
//    - Replace Temp with Query로 임시변수에 담는 값을 계산하는 메소드 만들기
//    - 지역변수의 이름은 같지만 계산 수식에 차이가 있으므로 메소드를 자식 클래스에 그대로 둠
// 3. getBillableAmount메소드의 return 값도 Replace Temp with Query로 메소드를 만들기
//    - return 값을 계산하는 메소드는 일치하므로 Pull Method를 이용하여 부모클래스로 옮기기
//    - 이 때, 부모클래스로 옮기는 메소드는 "템플릿 메소드(Template Method)"라고 부름

public class Site {
    protected static final double TAX_RATE = 1.0;
    protected double units;
    protected double rate;

    public Site() {
        units = 100.0;
        rate = 0.5;
    }

}
