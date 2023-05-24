package ch0203;

public class AssignmentDemo {
    public static void main(String[] args) {
        int value = 1;
        value += 1;
        System.out.println("값 = " + value);
        value -= 1;
        System.out.println("값 = " + value);
        value <<= 3;                               // value의 처음 값은 1이며, <<3 연산을 수행하면 2를 세 번 곱하므로 결괏값은 8
        System.out.println("값 = " + value);
        value %= 3;
        System.out.println("값 = " + value);

    }
}
