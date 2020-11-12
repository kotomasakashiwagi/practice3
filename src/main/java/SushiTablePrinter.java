public class SushiTablePrinter {
    final static String[] sushiTable = {
            "いくら", "タコ", "まぐろ", "いか", "あじ", "さば", "こはだ", "うに", "サーモン", "えび"
    };

    public static void printSushiTable() {
        for (int i = 0; i < sushiTable.length; i++) {
            System.out.println(sushiTable[i] + ":" + i);
        }
    }
}
