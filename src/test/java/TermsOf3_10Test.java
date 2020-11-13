import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TermsOf3_10Test {
    @Test
    public void term_1Of3_10Test() {
        assertTrue(TermsOf3_10.term_1Of3_10(new IntPair(12, 222)));
        assertFalse(TermsOf3_10.term_1Of3_10(new IntPair(12, 12)));
    }

    @Test
    public void term_2Of3_10Test() {
        assertTrue(TermsOf3_10.term_2Of3_10(new IntPair(-12, -12)));
        assertFalse(TermsOf3_10.term_2Of3_10(new IntPair(12, 12)));
        assertFalse(TermsOf3_10.term_2Of3_10(new IntPair(-2, -12)));
    }

    @Test
    public void term_3Of3_10Test() {
        assertTrue(TermsOf3_10.term_3Of3_10(new IntPair(12, 1)));
        assertTrue(TermsOf3_10.term_3Of3_10(new IntPair(2, 10)));
        assertFalse(TermsOf3_10.term_3Of3_10(new IntPair(1, 0)));

    }

    @Test
    public void term_4Of3_10Test() {
        assertTrue(TermsOf3_10.term_4Of3_10(new IntPair(24, 22)));
        assertFalse(TermsOf3_10.term_4Of3_10(new IntPair(-12, 2)));
    }

    @Test
    public void term_5Of3_10() {
        assertTrue(TermsOf3_10.term_5Of3_10(new IntPair(-12, 14)));
        assertFalse(TermsOf3_10.term_5Of3_10(new IntPair(-12, -14)));
    }


}