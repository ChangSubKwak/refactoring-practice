package solution._3_replace_method_with_method_object;

import org.junit.jupiter.api.Test;
import solution._3_replace_method_with_method_object._1.ReplaceMethodWithMethodObject;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceMethodWithMethodObjectTest {

	@Test
	void gamma() {
		ReplaceMethodWithMethodObject replaceMethodWithMethodObject = new ReplaceMethodWithMethodObject(50);
		assertThat(replaceMethodWithMethodObject.gamma(100, 3, 500)).isEqualTo(349860);
		assertThat(replaceMethodWithMethodObject.gamma(100, 4, 500)).isEqualTo(349800);
	}
}