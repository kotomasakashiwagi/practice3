public class DaysSearcher {
    private final static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //その月が何日あるか
    public static int searchDaysFromMonth(int i) {
        return days[i - 1];
    }
}
