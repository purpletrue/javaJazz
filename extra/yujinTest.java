package extra;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class yujinTest {

    @Test
    void fizzbuzz() {
        assertEquals("fizzbuzz", yujin.fizzbuzz(15, ""));
    }
    @Test
    void fizz() {
        assertEquals("fizz", yujin.fizzbuzz(3, ""));
    }
    @Test
    void buzz() {
        assertEquals("buzz", yujin.fizzbuzz(5, ""));
    }
    @Test
    void extra() {
        assertEquals("buzz", yujin.fizzbuzz(10, ""));
    }
    @Test
    void test() {
        int[] result = Arrays.stream(new int[] { 10, 20, 30, 40, 50 })
                .distinct()
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(result));
    }
}
