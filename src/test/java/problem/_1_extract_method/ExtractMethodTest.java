package problem._1_extract_method;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static problem.CommonUtil.getOutputStream;

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
}