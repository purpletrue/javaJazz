package ch09;

public class TryCatch1Demo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        try {
            System.out.println("첫번째 원소 => " + array[3]);
            System.out.println("마지막 원소 => " + array[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("원소가 존재하지 않습니다.");
        }
        System.out.println("어이쿠!");
    }
}
