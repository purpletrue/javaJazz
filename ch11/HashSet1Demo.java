package ch11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet1Demo {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "포도", "수박"};
        Set<String> h1 = new HashSet<>();
        Set<String> h2 = new HashSet<>();

        for (String s : fruits)
            h1.add(s);

        System.out.println("1단계 : " + h1);

        h1.add("바나나");
        h1.remove("포도");
        h1.add(null);

        System.out.println("2단계 : " + h1);
        System.out.println(h1.size());
        System.out.println(h1.contains("수박"));

        List<String> list = Arrays.asList(fruits);
        h2.addAll(list);
        System.out.println("3단계 : " + h2);
        h2.clear();
        System.out.println(h2.isEmpty());
    }
}
