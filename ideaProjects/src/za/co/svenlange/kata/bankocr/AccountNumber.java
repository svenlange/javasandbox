package za.co.svenlange.kata.bankocr;

import java.util.Arrays;
import java.util.List;

/**
 * AccountNumber
 *
 * @author Sven Lange
 */
public class AccountNumber {

    private final String accountNumber;

    public AccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < 27; i += 3) {
            StringBuffer sb = new StringBuffer();
            sb.append(accountNumber.substring(i, 0 + 3 + i));
            sb.append(accountNumber.substring(27 + i, 27 + 3 + i));
            sb.append(accountNumber.substring(54 + i, 54 + 3 + i));

            result += Digit.convert(sb);
        }

        if (result.contains("?")) {
            result += " ILL";
        }

        return result;
    }

    public String getAccountNumber() {
        StringBuilder sb = new StringBuilder();
        sb.append(accountNumber.substring(0, 27)).append("\n");
        sb.append(accountNumber.substring(27, 54)).append("\n");
        sb.append(accountNumber.substring(54, 81)).append("\n");
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
