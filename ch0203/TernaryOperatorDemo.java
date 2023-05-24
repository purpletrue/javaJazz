package ch0203;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int x = 1;
        int y;
        y = (x == 1) ? 10 : 20;
        System.out.println(y);
        y = (x > 1) ? x++ : x + 20;
        System.out.println(x);
        System.out.println(y);

//        System.out.println(5>3 ? "true" : "false");    -> 결과값 : true
    }
}
