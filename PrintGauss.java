package ch0203;

public class PrintGauss {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}

// printGauss(10, 20)   10+11+12+ ... +20
//         int printGauss;