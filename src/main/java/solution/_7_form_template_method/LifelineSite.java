package solution._7_form_template_method;

public class LifelineSite extends Site {
    @Override
    public double getBaseAmount() {
        return units * rate * 0.5;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
