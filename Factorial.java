package ch0203;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(1, 5));
        System.out.println(factorial(3, 5));
        System.out.println(factorial(10, 5));
    }
        static int factorial(int x) {
        int r = 1;
        while (x > 0) {
            r *= x--;
        }
        return r;
    }

    static int factorial(int x, int y) {
        int r = 1;
        while (x <= y) {
            r *= x++;
        }
        return r;
    }
}