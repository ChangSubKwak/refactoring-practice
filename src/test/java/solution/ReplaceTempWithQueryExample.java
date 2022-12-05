package solution;

public class ReplaceTempWithQueryExample {
    private int ONE = 1;
    private int TWO = 2;
    private int THREE = 3;
    private int FIVE = 5;

    void calculateComplexValues() {
        final int thirty = TWO * THREE * FIVE * ONE;
        final int sixty  = TWO * THREE * FIVE * TWO;
        final int ninety = TWO * THREE * FIVE * THREE;
    }

    void calculateComplexValuesByReplaceTempWithQuery() {
        final int thirty = getThirty() * ONE;
        final int sixty  = getThirty() * TWO;
        final int ninety = getThirty() * THREE;
    }

    void calculateComplexValuesByReplaceTempWithQuery2() {
        final int thirty = getThirtyByMultiplier(ONE);
        final int sixty  = getThirtyByMultiplier(TWO);
        final int ninety = getThirtyByMultiplier(THREE);
    }

    int getThirty() {
        return TWO * THREE * FIVE;
    }

    int getThirtyByMultiplier(int multiplier) {
        return getThirty() * multiplier;
    }

}
