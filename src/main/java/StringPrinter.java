public class StringPrinter {
    //大きい方の数または等しいことを出力
    public static void printBiggerInt(String s, IntPair intPair) {
        if (s.equals("true")) {
            System.out.println(intPair.getX());
        } else if (s.equals("false")) {
            System.out.println(intPair.getY());
        } else {
            System.out.println("xとyは同じです");
        }
    }

    //xがyより大きい時出力
    public static void printIsXBiggerY(String s) {
        if (s.equals("true")) {
            System.out.println("xはyより大きい");
        }
    }

    //大きい方の数を教えてくれる
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

    //隅奇を教えてくれる
    public static void printEvenOrOdd(boolean b) {
        if (b) {
            System.out.println("xは偶数です。");
        } else {
            System.out.println("xは奇数です。");
        }
    }

    //Stringをそのまま出力
    public static void printString(String s) {
        System.out.println(s);
    }

    //開いてるかどうか
    public static void printIsOnBusiness(boolean b) {
        if (b) {
            System.out.println("開いています。");
        } else {
            System.out.println("休診");
        }
    }

    //課題３−１０で満たした条件を全て出力
    public static void printResultOf3_10(IntPair intPair) {
        if (TermsOf3_10.term_1Of3_10(intPair)) {
            System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
        }
        if (TermsOf3_10.term_2Of3_10(intPair)) {
            System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
        }
        if (TermsOf3_10.term_3Of3_10(intPair)) {
            System.out.println("xはyより小さい、または、xは偶数である。");
        }
        if (TermsOf3_10.term_4Of3_10(intPair)) {
            System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
        }
        if (TermsOf3_10.term_5Of3_10(intPair)) {
            System.out.println("xもyも負の数である、ではない。");
        }

    }
}
