package solution._7_form_template_method;

import org.junit.jupiter.api.Test;
import problem._7_form_template_method.LifelineSite;
import problem._7_form_template_method.ResidentialSite;
import problem._7_form_template_method.Site;

import static org.assertj.core.api.Assertions.*;

public class FormTemplateMethodTest {
    @Test
    void test1() {
        Site site1 = new LifelineSite();
        double beforeValue = ((LifelineSite)site1).getBillableAmount();

        solution._7_form_template_method.Site site2 = new solution._7_form_template_method.LifelineSite();
        double afterValue = site2.getBillableAmount();

        assertThat(beforeValue).isEqualTo(afterValue);
    }

    @Test
    void test2() {
        Site site1 = new ResidentialSite();
        double beforeValue = ((ResidentialSite)site1).getBillableAmount();

        solution._7_form_template_method.Site site2 = new solution._7_form_template_method.ResidentialSite();
        double afterValue = site2.getBillableAmount();

        assertThat(beforeValue).isEqualTo(afterValue);
    }
}
