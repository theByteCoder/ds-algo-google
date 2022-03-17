package algorithms;

public class SumWithoutOperators {

    public static void main(String[] args) {
        System.out.println(sumWithoutOperators(0, 0));
    }

    public static int sumWithoutOperators(int a, int b) {
        if (b > 0) {
            for (int i = 1; i <= b; i++) {
                a++;
            }
        } else {
            for (int i = -1; i >= b; i--) {
                a--;
            }
        }
        return a;
    }
}
