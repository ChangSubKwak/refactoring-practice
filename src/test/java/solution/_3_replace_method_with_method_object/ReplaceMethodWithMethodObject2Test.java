package solution._3_replace_method_with_method_object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solution._3_replace_method_with_method_object._2.ReplaceMethodWithMethodObject2;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceMethodWithMethodObject2Test {

    @DisplayName("Sonny라는 이름과 금액데이터를 입력받았을 때, 금액에 맞는 데이터를 출력한다")
    @Test
    void printOwing() {
        double input1 = 10000.0;
        double input2 = 20000.0;
        double input3 = 30000.0;

        ReplaceMethodWithMethodObject2 replaceMethodWithMethodObject2 = ReplaceMethodWithMethodObject2.of("Sonny", Arrays.asList(1000.0, 2000.0, 3000.0));
        OutputStream out = getOutputStream((a, b, c) -> replaceMethodWithMethodObject2.printOwing(a, b, c), input1, input2, input3);
        assertThat(out.toString()).isEqualTo(
            "name : Sonny" + System.lineSeparator() +
                "amount1 : 36000.0" + System.lineSeparator() +
                "amount2 : 72000.0" + System.lineSeparator() +
                "amount3 : 108000.0" + System.lineSeparator() +
                "amount4 : 216000.0" + System.lineSeparator()
        );
    }

    public interface Print {
        void printOwing(double input1, double input2, double input3);
    }

    public static OutputStream getOutputStream(ReplaceMethodWithMethodObject2Test.Print print, double input1, double input2, double input3) {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        print.printOwing(input1, input2, input3);
        return out;
    }
}