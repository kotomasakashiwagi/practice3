public class TermsOf3_10 {
    //condition x<y　and　xが偶数　and　yが偶数
    public static boolean term_1Of3_10(IntPair intPair) {
        return UtilityOfIntPair.isXBiggerThanY(intPair).equals("false") &&
                UtilityOfInt.isEven(intPair.getX()) &&
                UtilityOfInt.isEven(intPair.getY());
    }

    //condition x=y and x>0 and y>0
    public static boolean term_2Of3_10(IntPair intPair) {
        return UtilityOfIntPair.isEqualPair(intPair) &&
                UtilityOfInt.isPositive(intPair.getX()) &&
                UtilityOfInt.isPositive(intPair.getY());
    }

    //condition x<y or xは偶数
    public static boolean term_3Of3_10(IntPair intPair) {
        return UtilityOfIntPair.isXBiggerThanY(intPair).equals("false")
                || UtilityOfInt.isEven(intPair.getX());
    }

    //condition min < x max
    public static boolean term_4Of3_10(IntPair intPair) {
        return UtilityOfInt.isOnRange(intPair.getX(), 10, 100)
                && UtilityOfInt.isOnRange(intPair.getY(), 10, 100);
    }

    //condition  x も y も負の数である、の否定
    public static boolean term_5Of3_10(IntPair intPair) {
        return !(!(UtilityOfInt.isPositive(intPair.getX())) && !(UtilityOfInt.isPositive(intPair.getY())));
    }
}
