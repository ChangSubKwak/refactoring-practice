package problem._2_replace_temp_with_query;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceTempWithQuery1Test {

    @DisplayName("quantity * price 값이 1000 이하의 경우")
    @Test
    void test1() {
        ReplaceTempWithQuery1 replaceTempWithQuery1 = new ReplaceTempWithQuery1(1, 500);
        assertThat(replaceTempWithQuery1.getPrice()).isEqualTo(490);
    }

    @DisplayName("quantity * price 값이 1000 초과의 경우")
    @Test
    void test2() {
        ReplaceTempWithQuery1 replaceTempWithQuery1 = new ReplaceTempWithQuery1(5, 500);
        assertThat(replaceTempWithQuery1.getPrice()).isEqualTo(2375);
    }
}