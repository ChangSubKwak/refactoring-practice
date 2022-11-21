package solution._3_replace_method_with_method_object;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceMethodWithMethodObjectTest {

    @Test
    void printOwing() {
        double input1 = 10000.0;
        double input2 = 20000.0;
        double input3 = 30000.0;

        ReplaceMethodWithMethodObject replaceMethodWithMethodObject = ReplaceMethodWithMethodObject.of("Sonny", Arrays.asList(1000.0, 2000.0, 3000.0));
        OutputStream out = getOutputStream((a, b, c) -> replaceMethodWithMethodObject.printOwing(a, b, c), input1, input2, input3);
        assertThat(out.toString()).isEqualTo(
            "name : Sonny\r\n" +
                "amount1 : 36000.0\r\n" +
                "amount2 : 72000.0\r\n" +
                "amount3 : 108000.0\r\n" +
                "amount4 : 216000.0\r\n"
        );
    }

    public interface Print {
        void printOwing(double input1, double input2, double input3);
    }

    public static OutputStream getOutputStream(ReplaceMethodWithMethodObjectTest.Print print, double input1, double input2, double input3) {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        print.printOwing(input1, input2, input3);
        return out;
    }
}