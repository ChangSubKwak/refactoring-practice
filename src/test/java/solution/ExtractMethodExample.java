package solution;

public class ExtractMethodExample {
    void printSumAboutFromOneToTen() {
        System.out.println("안녕하세요.");
        System.out.println("1 ~ 10까지 더한 값을 출력합니다.");
        System.out.println("내용은 다음과 같습니다.");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1 ~ 10까지 더한 값은 다음과 같습니다.");
        System.out.println("sum = " + sum);
    }

    void printSumAboutFromOneToTenWithRefactoring() {
        printHeader();
        int sum = getSum();
        printTail(sum);
    }

    private static void printTail(int sum) {
        System.out.println("1 ~ 10까지 더한 값은 다음과 같습니다.");
        System.out.println("sum = " + sum);
    }

    private static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    private static void printHeader() {
        System.out.println("안녕하세요.");
        System.out.println("1 ~ 10까지 더한 값을 출력합니다.");
        System.out.println("내용은 다음과 같습니다.");
    }
}
