package za.co.svenlange.kata.bankocr;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * TODO/FIXME Javadoc
 *
 * @author Sven Lange
 */
public class AccountNumberTest {

    @Test
    public void convertLineToInteger_123456789() {
        String input = "    _  _     _  _  _  _  _ " +
                       "  | _| _||_||_ |_   ||_||_|" +
                       "  ||_  _|  | _||_|  ||_| _|";

        assertEquals(123456789, new AccountNumber(input).toInteger());
    }

    @Test
    public void convertLineToInteger_173456700() {
        String input = "    _  _     _  _  _  _  _ " +
                       "  |  | _||_||_ |_   || || |" +
                       "  |  | _|  | _||_|  ||_||_|";

        assertEquals(173456700, new AccountNumber(input).toInteger());
    }
    
    @Test
    public void convertLineToString_173456700() {
        String input = "    _  _     _  _  _  _  _ " +
                       "  |  | _||_||_ |_   || || |" +
                       "  |  | _|  | _||_|  ||_||_|";

        assertEquals("173456700", new AccountNumber(input).toString());
    }
    
    @Test
    public void convertLineToString_000000000() {
        String input = " _  _  _  _  _  _  _  _  _ " +
                       "| || || || || || || || || |" +
                       "|_||_||_||_||_||_||_||_||_|";

        assertEquals("000000000", new AccountNumber(input).toString());
    }
    
    @Test
    public void convertLineToString_000000001() {
        String input = " _  _  _  _  _  _  _  _    " +
                       "| || || || || || || || |  |" +
                       "|_||_||_||_||_||_||_||_|  |";

        assertEquals("000000001", new AccountNumber(input).toString());
    }
    
    @Test
    public void isValid_345882865() {
        String input = " _     _  _  _  _  _  _  _ " +
                       " _||_||_ |_||_| _||_||_ |_ " +
                       " _|  | _||_||_||_ |_||_| _|";

        assertEquals(true, new AccountNumber(input).isValid());
    }
    
}
