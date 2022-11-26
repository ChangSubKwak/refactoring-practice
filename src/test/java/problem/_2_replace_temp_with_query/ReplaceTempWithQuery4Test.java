package problem._2_replace_temp_with_query;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceTempWithQuery4Test {
	@DisplayName("quantity * price 값이 1000 이하의 경우")
	@Test
	void test1() {
		ReplaceTempWithQuery4 replaceTempWithQuery4 = new ReplaceTempWithQuery4(1, 500);
		assertThat(replaceTempWithQuery4.getPrice()).isEqualTo(490);
	}

	@DisplayName("quantity * price 값이 1000 초과의 경우")
	@Test
	void test2() {
		ReplaceTempWithQuery4 replaceTempWithQuery4 = new ReplaceTempWithQuery4(5, 500);
		assertThat(replaceTempWithQuery4.getPrice()).isEqualTo(2375);
	}
}