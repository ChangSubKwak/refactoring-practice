package solution._3_replace_method_with_method_object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solution._3_replace_method_with_method_object._1.ReplaceMethodWithMethodObject1;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceMethodWithMethodObject1Test {

	@DisplayName("delta값은 50으로 하고, gamma 메소드에 인자값을 100(입력값), 3(수량), 500(년수) 입력하면 349860을 반환한다")
	@Test
	void gamma1() {
		ReplaceMethodWithMethodObject1 replaceMethodWithMethodObject1 = new ReplaceMethodWithMethodObject1(50);
		assertThat(replaceMethodWithMethodObject1.gamma(100, 3, 500)).isEqualTo(349860);
	}

	@DisplayName("delta값은 50으로 하고, gamma 메소드에 인자값을 100(입력값), 4(수량), 500(년수) 입력하면 349800을 반환한다")
	@Test
	void gamma2() {
		ReplaceMethodWithMethodObject1 replaceMethodWithMethodObject1 = new ReplaceMethodWithMethodObject1(50);
		assertThat(replaceMethodWithMethodObject1.gamma(100, 4, 500)).isEqualTo(349800);
	}
}