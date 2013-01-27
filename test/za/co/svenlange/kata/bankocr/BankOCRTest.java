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

        assertEquals("000000000", content.get(0).toString());
        assertEquals("111111111", content.get(1).toString());
        assertEquals("222222222", content.get(2).toString());
        assertEquals("123456789", content.get(3).toString());
        assertEquals("000000001", content.get(4).toString());
    }

    @Test
    public void outputFileContent() {
        BankOCR ocr = new BankOCR("input1.txt");
        ocr.output();
    }


}
