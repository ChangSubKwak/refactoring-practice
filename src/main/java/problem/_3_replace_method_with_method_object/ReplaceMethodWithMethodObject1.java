package problem._3_replace_method_with_method_object;

public class ReplaceMethodWithMethodObject1 {
    private int six = 6;

    public void printNumberAndStatistics(int seven) {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;

        System.out.println("one = " + one);
        System.out.println("two = " + two);
        System.out.println("three = " + three);
        System.out.println("four = " + four);
        System.out.println("five = " + five);
        System.out.println("six = " + six);
        System.out.println("seven = " + seven);

        int sum = one + two + three + four + five + six + seven;
        int average = sum / 7;
        int variation = (int)(Math.pow(one - average, 2) + Math.pow(two - average, 2) + Math.pow(three - average, 2) +
                Math.pow(four - average, 2) + Math.pow(five - average, 2) + Math.pow(six - average, 2) +
                Math.pow(seven - average, 2));

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("variation = " + variation);
    }
}
