package solution._7_form_template_method;

public abstract class Site {
    protected static final double TAX_RATE = 1.0;
    protected double units;
    protected double rate;

    public Site() {
        units = 100.0;
        rate = 0.5;
    }

    public abstract double getBaseAmount();
    public abstract double getTaxAmount();

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
