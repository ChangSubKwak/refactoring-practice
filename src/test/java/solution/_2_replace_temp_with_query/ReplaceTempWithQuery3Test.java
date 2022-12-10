package solution._2_replace_temp_with_query;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import problem._2_replace_temp_with_query.ReplaceTempWithQuery3;


import java.io.OutputStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static solution.CommonUtil.getOutputStream;

class ReplaceTempWithQuery3Test {

    @DisplayName("이름과 금액값 리스트를 입력으로 받을 경우 올바른 출력 확인")
    @Test
    void printOwing() {
        ReplaceTempWithQuery3 replaceTempWithQuery3 = ReplaceTempWithQuery3.of("Sonny", Arrays.asList(1000.0, 2000.0, 3000.0));
        OutputStream out = getOutputStream(replaceTempWithQuery3::printOwing);
        assertThat(out.toString()).isEqualTo(
            "name : Sonny" + System.lineSeparator() +
                "amount1 : 6000.0" + System.lineSeparator() +
                "amount2 : 12000.0" + System.lineSeparator() +
                "amount3 : 18000.0" + System.lineSeparator() +
                "amount4 : 36000.0" + System.lineSeparator()
        );
    }
}