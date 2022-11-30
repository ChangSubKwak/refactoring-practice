package solution._7_form_template_method;

public class LifelineSite extends Site {
    public double getBillableAmount() {
        double base = units * rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
