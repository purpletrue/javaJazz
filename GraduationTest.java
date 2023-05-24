package ch0203;

import java.util.Scanner;

public class GraduationTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("전공 이수 학점: ");
        int major = in.nextInt();
        System.out.print("교양 이수 학점: ");
        int liberal = in.nextInt();
        System.out.print("일반 이수 학점: ");
        int general = in.nextInt();

        boolean b = ((major + liberal + general) >= 140)
                && ((liberal >= 30 && general >= 30) || (liberal + general >= 80));
        System.out.println(b ? "졸업 가능" : "졸업 불가");
    }
}
