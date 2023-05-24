package ch0203;

import java.util.Scanner;

public class DigitSumTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int x = in.nextInt();

        int d, sum;
        sum = x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        System.out.println("각 자리수의 합 = " + sum);
    }
}
