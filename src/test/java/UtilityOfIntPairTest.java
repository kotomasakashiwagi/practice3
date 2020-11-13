import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityOfIntPairTest {
    @Test
    public void isXBiggerThanYTest() {
        assertEquals(EnumOfCompareXY.CompareXY.XBiggerY, UtilityOfIntPair.judgeXBiggerThanY(new IntPair(20, -19)));
        assertEquals(EnumOfCompareXY.CompareXY.YBiggerX, UtilityOfIntPair.judgeXBiggerThanY(new IntPair(2, 19)));
        assertEquals(EnumOfCompareXY.CompareXY.XEqualY, UtilityOfIntPair.judgeXBiggerThanY(new IntPair(0, 0)));
    }

    @Test
    public void isEqualPair() {
        assertTrue(UtilityOfIntPair.isEqualPair(new IntPair(12, 12)));
        assertFalse(UtilityOfIntPair.isEqualPair(new IntPair(2, 12)));
    }

}