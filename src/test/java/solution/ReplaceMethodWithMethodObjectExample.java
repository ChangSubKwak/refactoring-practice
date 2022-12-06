package solution;

import org.junit.jupiter.api.Test;

public class ReplaceMethodWithMethodObjectExample {

    @Test
    void manyTempVariablesExist() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;

        System.out.println("하나는 숫자로 " + one);
        System.out.println("둘은 숫자로 " + two);
        System.out.println("셋은 숫자로 " + three);
        System.out.println("넷은 숫자로 " + four);
        System.out.println("다섯은 숫자로 " + five);

        int sum = one + two + three + four + five;
        int average = sum / 5;
        int variation = (int)(Math.pow((one - average), 2) + Math.pow((two - average), 2)
            + Math.pow((three - average), 2) + Math.pow((four - average), 2)
            + Math.pow((five - average), 2));

        System.out.println("모든 수의 합은 " + sum);
        System.out.println("모든 수의 평균은 " + average);
        System.out.println("모든 수의 분산은 " + variation);
    }

    @Test
    void manyTempVariablesExist_BadRefactoringExample() {
        int one = getNumberAndPrint(1, "하나는 숫자로 ");
        int two = getNumberAndPrint(2, "둘은 숫자로 ");
        int three = getNumberAndPrint(3, "셋은 숫자로 ");
        int four = getNumberAndPrint(4, "넷은 숫자로 ");
        int five = getNumberAndPrint(5, "다섯은 숫자로 ");

        int sum = getSum(one, two, three, four, five);
        int average = getAverage(sum);
        int variation = getVariation(one, two, three, four, five, average);

        printSumAndAverageAndVariation(sum, average, variation);
    }

    @Test
    void manyTempVariablesExist_GoodRefactoringExample() {
        ReplaceMethodWithMethodObjectExample.Calculation calculation =
            new ReplaceMethodWithMethodObjectExample.Calculation(1, 2, 3, 4, 5);
        calculation.getNumberAndPrint();
        calculation.printResult();
    }

    static class Calculation {
        private int one;
        private int two;
        private int three;
        private int four;
        private int five;

        public Calculation(int one, int two, int three, int four, int five) {
            this.one = one;
            this.two = two;
            this.three = three;
            this.four = four;
            this.five = five;
        }

        public void getNumberAndPrint() {
            System.out.println("하나는 숫자로 " + one);
            System.out.println("둘은 숫자로 " + two);
            System.out.println("셋은 숫자로 " + three);
            System.out.println("넷은 숫자로 " + four);
            System.out.println("다섯은 숫자로 " + five);
        }

        private int getSum() {
            return one + two + three + four + five;
        }

        private int getAverage() {
            return getSum() / 5;
        }

        private int getVariation() {
            return (int)(Math.pow((one - getAverage()), 2) + Math.pow((two - getAverage()), 2) + Math.pow((three - getAverage()), 2) + Math.pow((four - getAverage()), 2) + Math.pow((five - getAverage()), 2));
        }

        public void printResult() {
            System.out.println("모든 수의 합은 " + getSum());
            System.out.println("모든 수의 평균은 " + getAverage());
            System.out.println("모든 수의 분산은 " + getVariation());
        }
    }

    private void printSumAndAverageAndVariation(int sum, int average, int variation) {
        System.out.println("모든 수의 합은 " + sum);
        System.out.println("모든 수의 평균은 " + average);
        System.out.println("모든 수의 분산은 " + variation);
    }

    private int getVariation(int one, int two, int three, int four, int five, int average) {
        int variation = (int)(Math.pow((one - average), 2) + Math.pow((two - average), 2) + Math.pow((three - average), 2) + Math.pow((four - average), 2) + Math.pow((five - average), 2));
        return variation;
    }

    private int getAverage(int sum) {
        int average = sum / 5;
        return average;
    }

    private int getSum(int one, int two, int three, int four, int five) {
        int sum = one + two + three + four + five;
        return sum;
    }

    private int getNumberAndPrint(int number, String x) {
        System.out.println(x + number);
        return number;
    }
}
