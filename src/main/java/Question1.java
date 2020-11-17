import java.util.InputMismatchException;

public class Question1 implements Question {

    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();
            EnumOfCompareXY.CompareXY enumXY = UtilityOfIntPair.judgeXBiggerThanY(intPair);
            StringPrinter.printIsXBiggerY(enumXY);
        } catch (InputMismatchException e) {
            System.err.println("有効な数字を入力してください。");
        }
    }
}


