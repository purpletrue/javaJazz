package ch0203;

public class DoWhile3Demo {
    public static void main(String[] args) {
        int row = 1;
        do{
            int column = 1;
            do{
                System.out.println(row + "x" + column + "=" + row * column);
                column++;
            } while (column < 20);
            row++;
        } while (row < 20);

    }
}



//    public static void main(String[] args) {
//        int row = 2;
//        do {
//            int column = 1;
//            do {
//                System.out.printf("%2d\t", row * column);
//                column++;
//            } while (column <= 19);
//            System.out.println();
//            row++;
//        } while (row <= 19);
//    }
//}
//
//package ch0203;
//
//public class DoWhile3Demo {
//    public static void main(String[] args) {
//        int row = 2;
//        while (row <= 19) {
//            int column = 1;
//            while (column <= 19) {
//                System.out.printf("%2d\t", row * column);
//                column++;
//            }
//            System.out.println();
//            row++;
//        }
//    }
//}

