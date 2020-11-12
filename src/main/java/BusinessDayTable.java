public class BusinessDayTable {
    //営業表
    static final boolean[][] businessTable = {{false, true, false, true, true, false, true},
            {false, true, true, true, true, true, false},
            {false, true, true, false, true, true, false}};

    //開いてるかどうか
    public static boolean isOnBusiness(IntPair intPair) {
        int timeZone = intPair.getY();
        int weekDays = intPair.getX();
        return businessTable[timeZone][weekDays];

    }
}


