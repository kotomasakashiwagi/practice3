public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("引数の数はひとつで,問題番号である必要があります。");
            System.exit(0);//０が正常終了０以外が異常終了
        } else if (args[0].equals("3-1")) {
            IntPair intPair = Scanner.scanXY();
            String s = UtilityOfIntPair.isXBiggerThanY(intPair);
            StringPrinter.printIsXBiggerY(s);
        } else if ((args[0].equals("3-2"))) {
            IntPair intPair = Scanner.scanXY();
            String s = UtilityOfIntPair.isXBiggerThanY(intPair);
            StringPrinter.printBiggerInt(s, intPair);
        } else if ((args[0].equals("3-3"))) {

            try {
                IntPair intPair = Scanner.scanXY();
                String s = UtilityOfIntPair.isXBiggerThanY(intPair);
                StringPrinter.printIsXBiggerYOrNot(s);
            } catch (NumberFormatException e) {
                System.err.println("int型　\"x y\" を入力してください。");
            }


        } else if ((args[0].equals("3-4"))) {

            try {
                IntPair intPair = Scanner.scanXY();
                String s = UtilityOfIntPair.isXBiggerThanY(intPair);
                StringPrinter.printIsXBiggerYOrNot(s);
            } catch (NumberFormatException e) {
                System.err.println("int型　\"x y\" を入力してください。");
            }


        } else if ((args[0].equals("3-5"))) {

            try {
                int x = Scanner.scanPositiveX();
                boolean b = UtilityOfInt.isEven(x);
                StringPrinter.printEvenOrOdd(b);
            } catch (NumberFormatException e) {
                System.err.println("\"int型正数\"x を入力してください。");
            } catch (IllegalArgumentException e) {
                System.err.println("正の数を入力してください。");
            }

        } else if ((args[0].equals("3-6"))) {

            try {
                int x = Scanner.scanIntX();
                String s = UtilityOfInt.groupNumber(x);
                StringPrinter.printString(s);
            } catch (NumberFormatException e) {
                System.err.println("\"int型\"x を入力してください。");
            }

        } else if ((args[0].equals("3-7"))) {

            try {
                int x = Scanner.scanScore();
                String s1 = ScoreTable.groupScore1(x);
                StringPrinter.printString(s1);
                String s2 = ScoreTable.groupScore2(x);
                StringPrinter.printString(s2);
                String s3 = ScoreTable.groupScore3(x);
                StringPrinter.printString(s3);
            } catch (NumberFormatException e) {
                System.err.println("\"int型\"x を入力してください。");
            } catch (IllegalArgumentException e) {
                System.err.println("有効な点数を入力してください。");
            }

        } else {
            System.err.println("問題番号を指定してください。");
        }
    }
}
