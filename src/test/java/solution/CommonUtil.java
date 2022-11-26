package solution;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class CommonUtil {
    public interface Print {
        void printOwing();
    }

    public static OutputStream getOutputStream(Print print) {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        print.printOwing();
        return out;
    }
}
