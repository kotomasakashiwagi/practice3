import java.util.InputMismatchException;

public class Question4 implements Question {
    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();
            EnumOfCompareXY.CompareXY enumXY = UtilityOfIntPair.judgeXBiggerThanY(intPair);
            StringPrinter.printIsXBiggerYOrNot(enumXY);
        } catch (InputMismatchException e) {
            System.err.println("整数　\"x y\" を入力してください。");
        }
    }
}
