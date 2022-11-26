package solution._5_pull_up_field;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PullUpFieldTest {

	@DisplayName("Pull Up Field(필드 올리기)를 수행을 하면 부모에 protected 접근자의 변수가 존재한다")
	@Test
	void employee() throws NoSuchFieldException {
		Class classForEmployee = solution._5_pull_up_field.Employee.class;
		Field nameField = classForEmployee.getDeclaredField("name");

		assertThat(nameField).isNotNull();
		assertThat(nameField.getName()).isEqualTo("name");
		assertThat(nameField.getModifiers()).isEqualTo(Modifier.PROTECTED);
	}

	@DisplayName("Pull Up Field(필드 올리기)를 수행을 하면 자식(Engineer)에 private 접근자의 변수가 존재하지 않는다")
	@Test
	void engineer() {
		Class classForEngineer = solution._5_pull_up_field.Engineer.class;
		assertThatThrownBy(
				() -> classForEngineer.getDeclaredField("name")
		).isInstanceOf(NoSuchFieldException.class);
	}

	@DisplayName("Pull Up Field(필드 올리기)를 수행을 하면 자식(Engineer)에 private 접근자의 변수가 존재하지 않는다")
	@Test
	void salesman() {
		Class classForSalesman = solution._5_pull_up_field.Salesman.class;
		assertThatThrownBy(
				() -> classForSalesman.getDeclaredField("name")
		).isInstanceOf(NoSuchFieldException.class);
	}
}
