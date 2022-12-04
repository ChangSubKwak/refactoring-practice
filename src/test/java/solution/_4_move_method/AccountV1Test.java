package solution._4_move_method;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AccountV1Test {

	@DisplayName("계좌가 프리미엄이고 초과인출일자가 8일이면 은행부과율은 15.35이다.")
	@Test
	void test1() {
		AccountV1 accountV1 = AccountV1.of(8, AccountTypeV1.from(true));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(15.35);
	}

	@DisplayName("계좌가 프리미엄이고 초과인출일자가 7일이면 은행부과율은 14.5이다.")
	@Test
	void test2() {
		AccountV1 accountV1 = AccountV1.of(7, AccountTypeV1.from(true));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(14.5);
	}

	@DisplayName("계좌가 프리미엄이 아니고 초과인출일자가 8일이면 은행부과율은 18.5이다.")
	@Test
	void test3() {
		AccountV1 accountV1 = AccountV1.of(8, AccountTypeV1.from(false));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(18.5);
	}

	@DisplayName("계좌가 프리미엄이 아니고 초과인출일자가 7일이면 은행부과율은 16.75이다.")
	@Test
	void test4() {
		AccountV1 accountV1 = AccountV1.of(7, AccountTypeV1.from(false));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(16.75);
	}

	@DisplayName("계좌가 프리미엄이고 초과인출일자가 0일이면 은행부과율은 4.5이다.")
	@Test
	void test5() {
		AccountV1 accountV1 = AccountV1.of(0, AccountTypeV1.from(true));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(4.5);
	}

	@DisplayName("계좌가 프리미엄이 아니고 초과인출일자가 0일이면 은행부과율은 4.5이다.")
	@Test
	void test6() {
		AccountV1 accountV1 = AccountV1.of(0, AccountTypeV1.from(false));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(4.5);
	}
}