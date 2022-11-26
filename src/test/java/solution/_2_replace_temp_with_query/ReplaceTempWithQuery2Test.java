package solution._2_replace_temp_with_query;

import org.junit.jupiter.api.Test;


import java.io.OutputStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static problem.CommonUtil.getOutputStream;

class ReplaceTempWithQuery2Test {

    @Test
    void printOwing() {
        ReplaceTempWithQuery replaceTempWithQuery = ReplaceTempWithQuery.of("Sonny", Arrays.asList(1000.0, 2000.0, 3000.0));
        OutputStream out = getOutputStream(replaceTempWithQuery::printOwing);
        assertThat(out.toString()).isEqualTo(
            "name : Sonny\r\n" +
                "amount1 : 6000.0\r\n" +
                "amount2 : 12000.0\r\n" +
                "amount3 : 18000.0\r\n" +
                "amount4 : 36000.0\r\n"
        );
    }
}