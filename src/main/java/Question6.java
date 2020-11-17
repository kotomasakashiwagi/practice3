import java.util.InputMismatchException;

public class Question6 implements Question {

    @Override
    public void run() {
        try {
            int x = IntScanner.scanIntX();
            String s = UtilityOfInt.groupNumber(x);
            StringPrinter.printString(s);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\"x を入力してください。");
        }
    }
}