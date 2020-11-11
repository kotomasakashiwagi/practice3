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

    public static void printIsXBiggerY(String s) {
        if (s.equals("true")) {
            System.out.println("xはyより大きい");
        }
    }

    public static void printIsXBiggerYOrNot(String s) {
        if (s.equals("true")) {
            System.out.println("xはyより大きい");
        }
        if (s.equals("false")) {
            System.out.println("xはyより小さい");
        }
        if (s.equals("equal")) {
            System.out.println("xとyは等しい");
        }
    }

    public static void printEvenOrOdd(boolean b) {
        if (b) {
            System.out.println("xは偶数です。");
        } else {
            System.out.println("xは奇数です。");
        }
    }

    public static void printString(String s) {
        System.out.println(s);
    }
}
