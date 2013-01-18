package za.co.svenlange.kata.bankocr;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * DigitTest
 *
 * @author Sven Lange
 */
public class DigitTest {

    @Test
    public void convertNull() {
        String line = " _ " +
                      "| |" +
                      "|_|";

        assertToInteger("0", line);
    }

    @Test
    public void convertEins() {
        String line = "   " +
                      "  |" +
                      "  |";

        assertToInteger("1", line);
    }

    @Test
    public void convertZwei() {
        String line = " _ " +
                      " _|" +
                      "|_ ";

        assertToInteger("2", line);
    }

    @Test
    public void convertDrei() {
        String line = " _ " +
                      " _|" +
                      " _|";

        assertToInteger("3", line);
    }

    @Test
    public void convertVier() {
        String line = "   " +
                      "|_|" +
                      "  |";

        assertToInteger("4", line);
    }

    @Test
    public void convertFuenf() {
        String line = " _ " +
                      "|_ " +
                      " _|";

        assertToInteger("5", line);
    }

    @Test
    public void convertSechs() {
        String line = " _ " +
                      "|_ " +
                      "|_|";

        assertToInteger("6", line);
    }

    @Test
    public void convertSieben() {
        String line = " _ " +
                      "  |" +
                      "  |";

        assertToInteger("7", line);
    }

    @Test
    public void convertAcht() {
        String line = " _ " +
                      "|_|" +
                      "|_|";

        assertToInteger("8", line);
    }

    @Test
    public void convertNeun() {
        String line = " _ " +
                      "|_|" +
                      " _|";

        assertToInteger("9", line);
    }

    private void assertToInteger(String expected, String input) {
        assertEquals(expected, new Digit(input).toInteger());
    }

}
