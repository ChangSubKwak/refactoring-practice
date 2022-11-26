package solution._4_move_method;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountV1Test {
	@Test
	void test() {
		AccountV1 accountV1 = AccountV1.of(AccountTypeV1.of(true, 8));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(15.35);

		accountV1 = AccountV1.of(AccountTypeV1.of(true, 7));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(14.5);

		accountV1 = AccountV1.of(AccountTypeV1.of(false, 8));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(18.5);

		accountV1 = AccountV1.of(AccountTypeV1.of(false, 7));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(16.75);

		accountV1 = AccountV1.of(AccountTypeV1.of(true, 0));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(4.5);

		accountV1 = AccountV1.of(AccountTypeV1.of(false, 0));
		Assertions.assertThat(accountV1.bankCharge()).isEqualTo(4.5);
	}
}