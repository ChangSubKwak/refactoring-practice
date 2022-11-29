package solution._3_replace_method_with_method_object._2;

import java.util.List;

public class ReplaceMethodWithMethodObject2 {
    private String name;
    private List<Double> amounts;

    private ReplaceMethodWithMethodObject2(String name, List<Double> amounts) {
        this.name = name;
        this.amounts = amounts;
    }

    public static ReplaceMethodWithMethodObject2 of(String name, List<Double> amounts) {
        return new ReplaceMethodWithMethodObject2(name, amounts);
    }

    private MethodObject methodObject;

    public void printOwing(double input1, double input2, double input3) {
        MethodObject.of(this, input1, input2, input3).printOwing();
    }

    public String getName() {
        return name;
    }

    public List<Double> getAmounts() {
        return amounts;
    }

}
