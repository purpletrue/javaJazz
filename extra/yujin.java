package extra;

// TODO: 2023-07 NCS평가
public class yujin {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String out = "";
            out = fizzbuzz(i, out);
            System.out.println(out);
        }
    }

    static String fizzbuzz(int i, String out) {
        if (i %3==0) {
            out +="fizz";
        }
        if (i %5==0) {
            out +="buzz";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            out += i;
        }
        return out;
    }
}
