package ch0203;

import java.util.Scanner;

public class RPS1Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("철수: ");
        String c = in.next();
        System.out.println("영희 : ");
        String y = in.next();

//        equals() 메서드 : 같으면 true 다르면 false로 내보내는 메서드
        if (c.equals(y))                    // c와 y가 같다면 true 아니면 false
            System.out.println("무승부!");
        else if (c.equals("r")) {
            if (y.equals("p"))
                System.out.println("영희, 승!");
            else
                System.out.println("철수, 승!");
        } else if (c.equals("p")) {
            if (y.equals("s"))
                System.out.println("영희, 승!");
            else
                System.out.println("철수, 승!");
        } else if (c.equals("s")) {
            if (y.equals("r"))
                System.out.println("영희, 승!");
            else
                System.out.println("철수, 승!");
        }
    }
}
