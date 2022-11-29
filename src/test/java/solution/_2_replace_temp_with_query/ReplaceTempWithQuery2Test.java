package solution._2_replace_temp_with_query;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import problem._2_replace_temp_with_query.ReplaceTempWithQuery2;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceTempWithQuery2Test {

    @DisplayName("quantity * price 값이 1000 이하의 경우")
    @Test
    void test1() {
        ReplaceTempWithQuery2 replaceTempWithQuery2 = new ReplaceTempWithQuery2(1, 500);
        assertThat(replaceTempWithQuery2.getPrice()).isEqualTo(980);
    }

    @DisplayName("quantity * price 값이 1000 초과의 경우")
    @Test
    void test2() {
        ReplaceTempWithQuery2 replaceTempWithQuery2 = new ReplaceTempWithQuery2(5, 500);
        assertThat(replaceTempWithQuery2.getPrice()).isEqualTo(950);
    }
}