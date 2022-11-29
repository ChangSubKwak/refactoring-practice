package solution._5_pull_up_field;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class PullUpFieldTest {
	@DisplayName("Pull Up Field를 수행이전의 Engineer 객체의 getName메소드의 반환값과 Pull Up Field를 수행이후의 Engineer 객체의 getName메소드의 반환값은 같다")
	@Test
	void employee() {
		problem._5_pull_up_field.Employee employee1 = new problem._5_pull_up_field.Engineer("changsub");
		solution._5_pull_up_field.Employee employee2 = new solution._5_pull_up_field.Engineer("changsub");

		assertThat(employee1.getName()).isEqualTo(employee2.getName());
	}
}
