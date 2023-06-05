package ch04;

//import java.sql.SQLOutput;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;
        double b = 0.0;
        int c = 0;

//        System.out.print(b);
//        System.out.print(a + c);

//        double d = 0.0;

        for (int e = 0; e < 10; e++ ) {
//            a = 1;
            System.out.print(e);
        }
//        형변환 55페이지 복습 x.castvar
        short x = 1;
//        x.castvar  탭    -> i 탭 -> y 탭
        int y                                = (int) x;


    }
}
