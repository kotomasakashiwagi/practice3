import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PublicHolidayTest {
    @Test
    public void findOutHolidayTest() {
        assertEquals("１１月：文化の日、勤労感謝の日", PublicHoliday.findOutHoliday(11));
        assertEquals("２月：建国記念の日", PublicHoliday.findOutHoliday(2));
    }

}