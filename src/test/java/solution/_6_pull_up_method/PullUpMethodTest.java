package solution._6_pull_up_method;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import problem._6_pull_up_method.RegularCustomer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PullUpMethodTest {
	@DisplayName("Pull Up Method 수행이전의 RegularCustomer 객체의 createBill메소드의 반환값과 Pull Up Method 수행이후의 RegularCustomer 객체의 createBill메소드의 반환값은 같다")
	@Test
	void test() {
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		problem._6_pull_up_method.Customer customer1 = new problem._6_pull_up_method.RegularCustomer();
		solution._6_pull_up_method.Customer customer2 = new solution._6_pull_up_method.RegularCustomer();

		//Assertions.assertThat(((RegularCustomer)(customer1)).createBill(date)).isEqualTo(customer2.createBill(date));
	}
}
