import java.util.InputMismatchException;

public class Question10 implements Question {

    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();//
            StringPrinter.printResultOf3_10(intPair);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        }
    }
}
