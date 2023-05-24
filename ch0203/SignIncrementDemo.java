package ch0203;

public class SignIncrementDemo {
    public static void main(String[] args) {
        int plusOne = 1;
        int minusOne = -plusOne;
        System.out.println(plusOne);
        System.out.println(minusOne);

        int x = 1, y = 1;
        System.out.println("x = " + x + ", ++x = " + ++x);
        System.out.println("y = " + y + ", y++ = " + y++);
        System.out.println("x = " + x + ", y = " + y);
    }
}
