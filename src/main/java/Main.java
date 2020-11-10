public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("引数の数はひとつで,問題番号である必要があります。");
            System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("3-1")) {
            IntPair intPair = Scanner.scanXY();
            String s = UtilityOfIntPair.isXBiggerThanY(intPair);
            StringPrinter.printString(s);
        } else if ((args[0].equals("3-2"))) {
            IntPair intPair = Scanner.scanXY();
            String s = UtilityOfIntPair.isXBiggerThanY(intPair);
            StringPrinter.printBiggerInt(s, intPair);
        } else {
            System.err.println("問題番号を指定してください。");
        }
    }
}
