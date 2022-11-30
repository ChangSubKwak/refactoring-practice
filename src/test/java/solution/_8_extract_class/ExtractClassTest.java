package solution._8_extract_class;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ExtractClassTest {
    @Test
    void test() {
        problem._8_extract_class.Person person1 = new problem._8_extract_class.Person("changsub", "02", "1234567");
        solution._8_extract_class.Person person2 = new solution._8_extract_class.Person("changsub", "02", "1234567");

        Assertions.assertThat(person1.getName()).isEqualTo(person2.getName());
        Assertions.assertThat(person1.getOfficeAreaCode()).isEqualTo(person2.getOfficeAreaCode());
        Assertions.assertThat(person1.getOfficeNumber()).isEqualTo(person2.getOfficeNumber());
    }
}
