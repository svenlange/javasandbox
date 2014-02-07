package za.co.svenlange.trampoline;

/**
 * Mutual recursion example.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isEven(11));
        System.out.println(isEven(20000)); // java.lang.StackOverflowError
    }

    private static boolean isEven(long number) {
        return number == 0 || isOdd(number - 1);
    }

    private static boolean isOdd(long number) {
        return number != 0 && isEven(number - 1);
    }

}
