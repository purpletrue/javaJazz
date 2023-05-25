package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
        List<String> list = Arrays.asList(fruits);      // 배열을 List 타입으로 변환, List 컬렉션의 원소가 String 타입

        Collections.sort(list, Collections.reverseOrder());   // Collections 클래스의 정적 메소드 reverse()와 reverseOrder()로 List 컬렉션 원소를 역방향으로 정렬
        System.out.println(list);

        Collections.reverse(list);     // Collections 클래스의 정적 메소드 reverse()와 reverseOrder()로 List 컬렉션 원소를 역방향으로 정렬
        System.out.println(list);
    }
}
