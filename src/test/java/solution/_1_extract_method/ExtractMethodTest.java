package solution._1_extract_method;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ExtractMethodTest {
    @Test
    void printOwing() {
        ExtractMethod extractMethod = ExtractMethod.of("Sonny", Arrays.asList(1000.0, 2000.0, 3000.0));
        OutputStream out = getOutputStream(extractMethod::printOwing);
        assertThat(out.toString()).isEqualTo(
            "*************************\r\n" +
                "***** Customer Owes *****\r\n" +
                "*************************\r\n" +
                "name : Sonny\r\n" +
                "amount : 6000.0\r\n"
        );
    }

    interface Print {
        void printOwing();
    }

    private static OutputStream getOutputStream(Print print) {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        print.printOwing();
        return out;
    }
}