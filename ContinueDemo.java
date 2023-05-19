package ch0203;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                continue;
            System.out.print(i);

//        for (int i = 1; i < 3; i++)
//            System.out.println(i);
        }
    }
}

