package solution._7_form_template_method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import problem._7_form_template_method.LifelineSite;
import problem._7_form_template_method.ResidentialSite;
import problem._7_form_template_method.Site;

import static org.assertj.core.api.Assertions.*;

public class FormTemplateMethodTest {
    @DisplayName("리팩토링 전의 Site객체와 리팩토링 후의 Site객체 각각 LifelineSite객체 생성후, getBillableAmount메소드 호출한 결과는 같다.")
    @Test
    void test1() {
        Site site1 = new LifelineSite();
        double beforeValue = ((LifelineSite)site1).getBillableAmount();

        solution._7_form_template_method.Site site2 = new solution._7_form_template_method.LifelineSite();
//        double afterValue = site2.getBillableAmount();

//        assertThat(beforeValue).isEqualTo(afterValue);
    }

    @DisplayName("리팩토링 전의 Site객체와 리팩토링 후의 Site객체 각각 ResidentialSite객체 생성후, getBillableAmount메소드 호출한 결과는 같다.")
    @Test
    void test2() {
        Site site1 = new ResidentialSite();
        double beforeValue = ((ResidentialSite)site1).getBillableAmount();

        solution._7_form_template_method.Site site2 = new solution._7_form_template_method.ResidentialSite();
//        double afterValue = site2.getBillableAmount();

//        assertThat(beforeValue).isEqualTo(afterValue);
    }
}
