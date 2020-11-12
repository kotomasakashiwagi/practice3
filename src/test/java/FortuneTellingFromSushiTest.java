import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FortuneTellingFromSushiTest {
    @Test
    public void fortuneTellingFromSushiTest() {
        assertEquals("大吉", FortuneTellingFromSushi.fortuneTellingFromSushi(7));
        assertEquals("凶", FortuneTellingFromSushi.fortuneTellingFromSushi(8));
    }

}