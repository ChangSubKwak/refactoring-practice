package solution._7_form_template_method;

public class ResidentialSite extends Site {
    @Override
    public double getBaseAmount() {
        return units * rate;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

}
