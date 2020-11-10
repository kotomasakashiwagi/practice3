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

}
