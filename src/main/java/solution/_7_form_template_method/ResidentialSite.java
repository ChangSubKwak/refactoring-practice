package solution._7_form_template_method;

public class ResidentialSite extends Site {
    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
