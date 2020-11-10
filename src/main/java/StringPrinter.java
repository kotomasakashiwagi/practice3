public class StringPrinter {
    public static void printBiggerInt(String s, IntPair intPair) {
        if (s.equals("true")) {
            System.out.println(intPair.getX());
        } else if (s.equals("false")) {
            System.out.println(intPair.getY());
        } else {
            System.out.println("xとyは同じです");
        }
    }

    public static void printString(String s) {
        if (s.equals("true")) {
            System.out.println("xはyより大きい");
        }
    }
}
