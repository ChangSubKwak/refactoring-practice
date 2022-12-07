package solution._3_replace_method_with_method_object;

import org.junit.jupiter.api.Test;
import solution._3_replace_method_with_method_object._1.ReplaceMethodWithMethodObject1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceMethodWithMethodObject1Test {

    @Test
    void manyTempVariablesExist() {
        int seven = 7;

        ReplaceMethodWithMethodObject1 replaceMethodWithMethodObject1 = new ReplaceMethodWithMethodObject1();
        OutputStream out = getOutputStream((e) -> replaceMethodWithMethodObject1.manyTempVariablesExist(e), seven);
        assertThat(out.toString()).isEqualTo(
                "one = 1" + System.lineSeparator() +
                        "two = 2" + System.lineSeparator() +
                        "three = 3" + System.lineSeparator() +
                        "four = 4" + System.lineSeparator() +
                        "five = 5" + System.lineSeparator() +
                        "six = 6" + System.lineSeparator() +
                        "seven = 7" + System.lineSeparator() +
                        "sum = 28" + System.lineSeparator() +
                        "average = 4" + System.lineSeparator() +
                        "variation = 28" + System.lineSeparator()
        );
    }

    public interface Print {
        void manyTempVariablesExist(int seven);
    }

    public static OutputStream getOutputStream(ReplaceMethodWithMethodObject1Test.Print print, int input1) {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        print.manyTempVariablesExist(input1);
        return out;
    }
}