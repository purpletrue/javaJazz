package ch0203;
import java.util.Scanner;

//키보드로 데이터 입력

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String y = in.nextLine();
        System.out.printf("%s + %s은 %s입니다.\n", x, y, x+y);

//        public class ScannerDemo {
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                int x = in.nextInt();
//                int y = in.nextInt();
//                System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
        // string = %s
        // int = %d
    }
}
