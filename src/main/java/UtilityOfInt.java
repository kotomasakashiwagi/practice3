public class UtilityOfInt {
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    private static final String SEINOGUSU = "正の偶数";
    private static final String SEINOKISU = "正の奇数";
    private static final String HUNOGUSU = "負の偶数";
    private static final String HUNOKISU = "負の奇数";

    public static String groupNumber(int x) {
        if (x >= 0) {
            if (isEven(x)) {
                return SEINOGUSU;
            } else {
                return SEINOKISU;
            }
        } else if (isEven(x)) {
            return HUNOGUSU;
        } else {
            return HUNOKISU;
        }
    }

    public static boolean isPositive(int i) {
        return i > 0;
    }

    public static boolean isOnRange(int i, int min, int max) {
        return i >= min && i <= max;
    }
}
