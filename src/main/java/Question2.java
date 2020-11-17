import java.util.InputMismatchException;

public class Question2 implements Question {
    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();
            EnumOfCompareXY.CompareXY enumXY = UtilityOfIntPair.judgeXBiggerThanY(intPair);
            StringPrinter.printBiggerInt(enumXY, intPair);
        } catch (InputMismatchException e) {
            System.err.println("有効な数字を入力してください。");
        }
    }
}
