import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class RomanNumeralsTest {
    RomanNumerals sut;

    @Before
    public void setUp(){
        sut = new RomanNumerals();
    }

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void adding101() {
        assertEquals(sut.change(101),"Until 100 numbers can change to RomanNumerals","Until 100 numbers can change to RomanNumerals");
    }

    @Test
    public void adding102() {
        assertEquals(sut.change(102),0,0);
    }



}