package za.co.svenlange.kata.bankocr;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * AccountNumberTest
 *
 * @author Sven Lange
 */
public class AccountNumberTest {

    @Test
    public void convertLineToInteger_123456789() {
        String line = "    _  _     _  _  _  _  _ " +
                      "  | _| _||_||_ |_   ||_||_|" +
                      "  ||_  _|  | _||_|  ||_| _|";

        assertEquals("123456789", new AccountNumber(line).toString());
    }

    @Test
    public void convertLineToInteger_173456700() {
        String line = "    _  _     _  _  _  _  _ " +
                      "  |  | _||_||_ |_   || || |" +
                      "  |  | _|  | _||_|  ||_||_|";

        assertEquals("173456700", new AccountNumber(line).toString());
    }
    
    @Test
    public void convertLineToString_173456700() {
        String line = "    _  _     _  _  _  _  _ " +
                      "  |  | _||_||_ |_   || || |" +
                      "  |  | _|  | _||_|  ||_||_|";

        assertEquals("173456700", new AccountNumber(line).toString());
    }
    
    @Test
    public void convertLineToString_000000000() {
        String line = " _  _  _  _  _  _  _  _  _ " +
                      "| || || || || || || || || |" +
                      "|_||_||_||_||_||_||_||_||_|";

        assertEquals("000000000", new AccountNumber(line).toString());
    }
    
    @Test
    public void convertLineToString_000000001() {
        String line = " _  _  _  _  _  _  _  _    " +
                      "| || || || || || || || |  |" +
                      "|_||_||_||_||_||_||_||_|  |";

        assertEquals("000000001", new AccountNumber(line).toString());
    }
    
    @Test
    public void isValid_345882865() {
        String line = " _     _  _  _  _  _  _  _ " +
                      " _||_||_ |_||_| _||_||_ |_ " +
                      " _|  | _||_||_||_ |_||_| _|";

        assertEquals(true, new AccountNumber(line).isValid());
    }
    
    @Test
    public void convertLineToString_49006771X() {
        String line = "    _  _  _  _  _  _     _ " +
                      "|_||_|| || ||_   |  |  | _ " +
                      "  | _||_||_ |_|  |  |  | _|";

        assertEquals("490?6771? ILL", new AccountNumber(line).toString());
    }
    
}
