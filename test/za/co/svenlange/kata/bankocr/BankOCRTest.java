package za.co.svenlange.kata.bankocr;

import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * BankOCRTest
 *
 * @author Sven Lange
 */
public class BankOCRTest {

    @Test(expected = RuntimeException.class)
    public void throwExceptionIfResourceDoesntExist() {
        new BankOCR("doesNotExist.txt");
    }

    @Test
    public void findResource() {
        new BankOCR("input1.txt");
    }

    @Test
    public void readFileContent() {
        BankOCR ocr = new BankOCR("input1.txt");
        List<AccountNumber> content = ocr.read();
        assertNotNull(content);
        assertEquals(5, content.size());

        assertEquals(0, content.get(0).toInteger());
        assertEquals(111111111, content.get(1).toInteger());
        assertEquals(222222222, content.get(2).toInteger());
        assertEquals(123456789, content.get(3).toInteger());
        assertEquals(1, content.get(4).toInteger());
    }

    @Test
    public void outputFileContent() {
        BankOCR ocr = new BankOCR("input1.txt");
        ocr.output();
    }


}
