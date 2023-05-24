package ch0203;

public class BreakDemo {
    public static void main(String[] args) {
        int i = 1, j = 5;

        while (true) {
            System.out.print(i++);
            if (i>=j)
                break;
        }
    }
}
