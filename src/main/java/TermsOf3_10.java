public class TermsOf3_10 {
    public static boolean term_1Of3_10(IntPair intPair) {
        return UtilityOfIntPair.isXBiggerThanY(intPair).equals("false") &&
                UtilityOfInt.isEven(intPair.getX()) &&
                UtilityOfInt.isEven(intPair.getY());
    }

    public static boolean term_2Of3_10(IntPair intPair) {
        return UtilityOfIntPair.isEqualPair(intPair) && UtilityOfInt.isPositive(intPair.getX())
                && UtilityOfInt.isPositive(intPair.getY());
    }

    public static boolean term_3Of3_10(IntPair intPair) {
        return UtilityOfIntPair.isXBiggerThanY(intPair).equals("false")
                || UtilityOfInt.isEven(intPair.getX());
    }

    public static boolean term_4Of3_10(IntPair intPair) {
        return UtilityOfInt.isOnRange(intPair.getX(), 10, 100)
                && UtilityOfInt.isOnRange(intPair.getY(), 10, 100);
    }

    public static boolean term_5Of3_10(IntPair intPair) {
        return !(UtilityOfInt.isPositive(intPair.getX()) && UtilityOfInt.isPositive(intPair.getY()));
    }
}
