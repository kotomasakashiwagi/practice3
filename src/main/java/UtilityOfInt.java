public class UtilityOfInt {
    public static boolean isEven(int x) {
       return x%2 == 0;
    }


    public static String groupNumber(int x) {
        if (x >= 0) {
            if (isEven(x)) {
                return "正の偶数";
            } else {
                return "正の奇数";
            }
        } else if (isEven(x)) {
            return "負の偶数";
        } else {
            return "負の奇数";
        }
    }
}