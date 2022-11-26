package solution._2_replace_temp_with_query;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceTempWithQueryTest {

    @DisplayName("quantity * price 값이 1000 초과할 때")
    @Test
    void test1() {
        ReplaceTempWithQuery replaceTempWithQuery = new ReplaceTempWithQuery(1, 500);
        assertThat(replaceTempWithQuery.getPrice()).isEqualTo(490);
    }

    @DisplayName("quantity * price 값이 1000 이하일 때")
    @Test
    void test2() {
        ReplaceTempWithQuery replaceTempWithQuery = new ReplaceTempWithQuery(5, 500);
        assertThat(replaceTempWithQuery.getPrice()).isEqualTo(2375);
    }
}