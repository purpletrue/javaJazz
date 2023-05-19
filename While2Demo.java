//package ch0203;
//
//public class While2Demo {
//    public static void main(String[] args) {
//        int value = 1;
//        System.out.print(value);
//        int row = 19;
//        while (row < 20) {
//            int column = 1;
//            while (column < 20) {
//                System.out.printf("%4d", row * column);
//                column++;
//            }
//            System.out.println();
//            row++;
//        }
//    }
//}


package ch0203;

public class While2Demo {
    public static void main(String[] args) {
        int row = 1;

        while (row < 20){
            int column = 1;
            while (column < 20) {
                System.out.printf("%3d X %3d = %3d\n",row,column,row*column);
                column++;
            }
            row++;
        }

    }
}
