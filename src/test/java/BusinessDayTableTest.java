import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessDayTableTest {
    @Test
    public void isOnBusinessTest() {
        assertTrue(BusinessDayTable.isOnBusiness(new IntPair(3, 0)));
        assertFalse(BusinessDayTable.isOnBusiness(new IntPair(0, 2)));
    }


}