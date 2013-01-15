package za.co.svenlange.kata.bankocr;

import java.util.Arrays;
import java.util.List;

/**
 * AccountNumber
 *
 * @author Sven Lange
 */
public class AccountNumber {

    private final String string;

    public AccountNumber(String string) {
        this.string = string;
    }

    public int toInteger() {
        int result = 0;

        int exponent = 8;

        for (int i = 0; i < 27; i += 3) {
            StringBuffer sb = new StringBuffer();
            sb.append(string.substring(0 + i, 0 + 3 + i));
            sb.append(string.substring(27 + i, 27 + 3 + i));
            sb.append(string.substring(54 + i, 54 + 3 + i));

            int number = new Digit(sb).toInteger();
            result += number * Math.pow(10, exponent);

            exponent--;
        }

        return result;
    }

    @Override
    public String toString() {
        String s = String.valueOf(this.toInteger());

        for (int i = 9 - s.length(); i > 0; i--) {
            s = "0" + s;
        }

        return s;
    }

    public String toEntryString() {
        StringBuilder sb = new StringBuilder();
        sb.append(string.substring(0, 27)).append("\n");
        sb.append(string.substring(27, 54)).append("\n");
        sb.append(string.substring(54, 81)).append("\n");
        return sb.toString();
    }

    public boolean isValid() {
        return checksum() % 11 == 0;
    }

    private int checksum() {
        List<String> strings = Arrays.asList(this.toString().split("."));

        int checksum = 0;
        for (int i = strings.size(); i > 0; i--) {
            checksum += Math.pow(10, i) * Integer.parseInt(strings.get(i));
        }
        return checksum;
    }
}
