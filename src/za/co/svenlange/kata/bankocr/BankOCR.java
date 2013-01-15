package za.co.svenlange.kata.bankocr;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BankOCR. Main class to parse input files.
 *
 * @author Sven Lange
 */
public class BankOCR {

    private final InputStream inputStream;

    public BankOCR(String inputFilePath) {
        inputStream = BankOCR.class.getResourceAsStream(inputFilePath);

        if (inputStream == null) {
            throw new RuntimeException("Given file does not exist.");
        }
    }

    public List<AccountNumber> read() {
        ArrayList<AccountNumber> result = new ArrayList<AccountNumber>();

        StringBuffer stringBuffer = new StringBuffer();

        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {

            String nextLine = scanner.nextLine();
            if (nextLine.length() == 27) {
                stringBuffer.append(nextLine);
            }

            if (stringBuffer.length() == 81) {
                String input = stringBuffer.toString();
                AccountNumber i = new AccountNumber(input);
                result.add(i);
                stringBuffer = new StringBuffer();
            }
        }


        return result;
    }

    public void output() {
        for(AccountNumber accountNumber : this.read()) {
            System.out.println(accountNumber.toEntryString());
            System.out.println("==> " + accountNumber);
        }
    }
}
