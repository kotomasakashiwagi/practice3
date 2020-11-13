public class UtilityOfIntPair {
    public static EnumOfCompareXY.CompareXY judgeXBiggerThanY(IntPair intPair) {
        if (intPair.getY() > intPair.getX()) {
            return EnumOfCompareXY.CompareXY.YBiggerX;
        } else if (intPair.getY() < intPair.getX()) {
            return EnumOfCompareXY.CompareXY.XBiggerY;
        } else {
            return EnumOfCompareXY.CompareXY.XEqualY;
        }
    }

    public static boolean isEqualPair(IntPair intPair) {
        return intPair.getX() >= intPair.getY() && intPair.getX() <= intPair.getY();
    }


}
