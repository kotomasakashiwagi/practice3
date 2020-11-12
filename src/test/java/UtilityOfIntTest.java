import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityOfIntTest {
    @Test
    public void isEvenTest() {
        assertTrue(UtilityOfInt.isEven(16));
        assertFalse(UtilityOfInt.isEven(13));
    }

    @Test
    public void groupNumberTest() {
        assertEquals("負の偶数", UtilityOfInt.groupNumber(-14));
    }

    @Test
    public void isPositiveTest() {
        assertTrue(UtilityOfInt.isPositive(17));
        assertFalse(UtilityOfInt.isPositive(-17));
    }

    @Test
    public void isOnRangeTest() {
        assertTrue(UtilityOfInt.isOnRange(100, 0, 100));
        assertTrue(UtilityOfInt.isOnRange(100, -100, 100));
        assertFalse(UtilityOfInt.isOnRange(-100, 0, 100));
    }

}