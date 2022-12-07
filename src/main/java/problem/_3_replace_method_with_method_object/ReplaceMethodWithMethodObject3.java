package problem._3_replace_method_with_method_object;

public class ReplaceMethodWithMethodObject3 {
	private int delta;

	public ReplaceMethodWithMethodObject3(int delta) {
		this.delta = delta;
	}

	//TODO: 다음의 메소드를 메소드 객체로 전환하기(1판 - Replace Method with Method Object, 2판 - Replace Function with Command)
	// 1. gamma 메소드에 대한 테스트 코드 작성
	// 2. 메소드의 이름을 따서 새로운 클래스(Gamma) 생성
	// 3. 새롭게 생성한 클래스에, ReplaceMethodWithMethodObject 객체를 담을 final 필드를 선언
	// 4. 아래의 gamma함수에서 사용되는 임시변수와 인자에 사용되는 모든 변수를 새롭게 만든 Gamma 클래스에 선언
	//    - (선택) gamma함수에서 사용되는 임시변수를 Replace Temp with Query를 사용하여 제거 가능
	// 5. Gamma 클래스에 Gamma(ReplaceMethodWithMethodObject account, int inputVal, int quantity, int yearToDate)와 같이
	//    gamma 메소드의 인자들과, ReplaceMethodWithMethodObject를 참조할 수 있는 생성자 만들기
	// 6. 새롭게 만든 Gamma 클래스에 gamma 메소드를 만들고 아래 메소드 코드를 복사하고 붙여넣기
	// 7. 새롭게 만든 Gamma 클래스에 gamma 인자를 비롯, 메소드내 불필요한 변수는 제거하고, 클래스 필드를 사용하도록 수정
	//    - ReplaceMethodWithMethodObject의 필드를 접근할 수 있는 getter 생성
	// 8. 아래의 gamma 메소드에서는 새로운 클래스의 객체의 compute메소드를 호출하도록 변경
	public int gamma(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}

		int importantValue3 = importantValue2 * 7;

		return importantValue3 - 2 * importantValue1;
	}

	public int delta() {
		return delta;
	}

}
