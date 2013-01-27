package za.co.svenlange.kata.bankocr;

/**
 * Digit
 *
 * @author Sven Lange
 */
public class Digit {
    
    private static final String NULL = " _ | ||_|";
    private static final String EINS = "     |  |";
    private static final String ZWEI = " _  _||_ ";
    private static final String DREI = " _  _| _|";
    private static final String VIER = "   |_|  |";
    private static final String FUENF = " _ |_  _|";
    private static final String SECHS = " _ |_ |_|";
    private static final String SIEBEN = " _   |  |";
    private static final String ACHT = " _ |_||_|";
    private static final String NEUN = " _ |_| _|";

    public static String convert(StringBuffer stringBuffer) {
        return convert(stringBuffer.toString());
    }
    
    public static String convert(String string) {
        if (string.equals(NULL)) {
            return "0";
        } else if (string.equals(EINS)) {
            return "1";
        } else if (string.equals(ZWEI)) {
            return "2";
        } else if (string.equals(DREI)) {
            return "3";
        } else if (string.equals(VIER)) {
            return "4";
        } else if (string.equals(FUENF)) {
            return "5";
        } else if (string.equals(SECHS)) {
            return "6";
        } else if (string.equals(SIEBEN)) {
            return "7";
        } else if (string.equals(ACHT)) {
            return "8";
        } else if (string.equals(NEUN)) {
            return "9";
        } else {
            return "?";
        }
    }
}
