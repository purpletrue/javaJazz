package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        for (char c = 'A'; c <= 'G'; c++)            // 문자 A부터 G까지 List 컬렉션에 저장, ㄱ부터 ㅎ까지 한글도 가능
            list.add(c);

        System.out.println("최초 리스트 :\t" + list);
        Collections.rotate(list, 3);
        System.out.println("돌린 리스트 :\t" + list);
        Collections.shuffle(list);                   // List 컬렉션의 원소를 무작위로 섞는다
        System.out.println("섞은 리스트 :\t" + list);
    }
}
