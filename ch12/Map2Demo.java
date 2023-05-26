package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map2Demo {
    public static void main(String[] args) {
        Stream<Nation> n1 = Nation.nation.stream();
        Stream<String> s1 = n1.map(Nation::getName);
        s1.limit(4).forEach(Util::printWithParenthesis);
        System.out.println();

        Stream<Nation> n2 = Nation.nation.stream();
        IntStream is = n2.mapToInt(Nation::getGdpRank);
        is.forEach(Util::print);
    }
}
