package solution._1_extract_method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solution._1_extract_method._1.ExtractMethod;

import java.io.OutputStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static solution.CommonUtil.getOutputStream;

class ExtractMethodTest {
    @DisplayName("이름과 금액값 리스트를 입력으로 받을 경우 올바른 출력 확인")
    @Test
    void printOwing() {
        ExtractMethod extractMethod = ExtractMethod.of("Sonny", Arrays.asList(1000.0, 2000.0, 3000.0));
        OutputStream out = getOutputStream(extractMethod::printOwing);
        assertThat(out.toString()).isEqualTo(
    "*************************" + System.lineSeparator() +
            "***** Customer Owes *****" + System.lineSeparator() +
            "*************************" + System.lineSeparator() +
            "name : Sonny" + System.lineSeparator() +
            "amount : 6000.0" + System.lineSeparator()
        );
    }
}