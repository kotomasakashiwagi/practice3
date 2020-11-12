public class BusinessDayTable {
    static final boolean[][] businessTable = {{false, true, false, true, true, false, true},
            {false, true, true, true, true, true, false},
            {false, true, true, false, true, true, false}};

    public static boolean isOnBusiness(IntPair intPair) {
        int timeZone = intPair.getY();
        int weekDays = intPair.getX();
        return businessTable[timeZone][weekDays];

    }
}


