import java.util.InputMismatchException;

public class Question5 implements Question {

    @Override
    public void run() {
        try {
            int x = IntScanner.scanPositiveX();
            boolean b = UtilityOfInt.isEven(x);
            StringPrinter.printEvenOrOdd(b);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\"x を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println("正の数を入力してください。");
        }
    }
}