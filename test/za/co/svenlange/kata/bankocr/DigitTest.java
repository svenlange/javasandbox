package za.co.svenlange.kata.bankocr;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * TODO/FIXME Javadoc
 *
 * @author Sven Lange
 */
public class DigitTest {

    @Test
    public void convertNull() {
        String input = " _ " +
                "| |" +
                "|_|";

        assertConvertZahl(0, input);
    }

    @Test
    public void convertEins() {
        String input = "   " +
                "  |" +
                "  |";

        assertConvertZahl(1, input);
    }

    @Test
    public void convertZwei() {
        String input = " _ " +
                " _|" +
                "|_ ";

        assertConvertZahl(2, input);
    }

    @Test
    public void convertDrei() {
        String input = " _ " +
                " _|" +
                " _|";

        assertConvertZahl(3, input);
    }

    @Test
    public void convertVier() {
        String input = "   " +
                "|_|" +
                "  |";

        assertConvertZahl(4, input);
    }

    @Test
    public void convertFuenf() {
        String input = " _ " +
                "|_ " +
                " _|";

        assertConvertZahl(5, input);
    }

    @Test
    public void convertSechs() {
        String input = " _ " +
                "|_ " +
                "|_|";

        assertConvertZahl(6, input);
    }

    @Test
    public void convertSieben() {
        String input = " _ " +
                "  |" +
                "  |";

        assertConvertZahl(7, input);
    }

    @Test
    public void convertAcht() {
        String input = " _ " +
                "|_|" +
                "|_|";

        assertConvertZahl(8, input);
    }

    @Test
    public void convertNeun() {
        String input = " _ " +
                "|_|" +
                " _|";

        assertConvertZahl(9, input);
    }

    private void assertConvertZahl(int expected, String input) {
        assertEquals(expected, new Digit(input).toInteger());
    }

}
