package za.co.svenlange.kata.romannumerals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * ConverterTest
 *
 * @author Sven Lange
 */
public class ConverterTest {

    @Test
    public void convertToRomanNumeral() {
        assertRomanNumeral("I", 1);
        assertRomanNumeral("II", 2);
        assertRomanNumeral("III", 3);
        assertRomanNumeral("IV", 4);
        assertRomanNumeral("V", 5);
        assertRomanNumeral("VI", 6);
        assertRomanNumeral("VII", 7);
        assertRomanNumeral("VIII", 8);
        assertRomanNumeral("IX", 9);
        assertRomanNumeral("X", 10);
        assertRomanNumeral("MCMXCIX", 1999);
    }

    private void assertRomanNumeral(String romanNumber, int latinNumber) {
        Converter converter = new Converter();
        assertEquals(romanNumber, converter.convert(latinNumber));
    }

}
