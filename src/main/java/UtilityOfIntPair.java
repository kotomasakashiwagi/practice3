public class UtilityOfIntPair {
    public static String isXBiggerThanY(IntPair intPair) {
        if (intPair.getY() > intPair.getX()) {
            return "false";
        } else if (intPair.getY() < intPair.getX()) {
            return "true";
        } else {
            return "equal";
        }
    }

    public static boolean isEqualPair(IntPair intPair) {
        return intPair.getX() >= intPair.getY() && intPair.getX() <= intPair.getY();
    }


}
