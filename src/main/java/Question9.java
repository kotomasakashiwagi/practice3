import java.util.InputMismatchException;

public class Question9 implements Question {

    @Override
    public void run() {
        TablePrinter.printOnBusiness();
        try {
            IntPair intPair = IntScanner.scanIntPairOfReservation();
            boolean b = BusinessDayTable.isOnBusiness(intPair);
            StringPrinter.printIsOnBusiness(b);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
