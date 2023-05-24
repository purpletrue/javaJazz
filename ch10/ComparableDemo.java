package ch10;

import java.lang.reflect.Array;
import java.util.Arrays;

class Rectangle implements Comparable<Rectangle> {          // Comparable 비슷한 단어 주의
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // TODO: 2023-05-24 this 
    public int findArea() {
        return width * height;
    }

    // TODO: 2023-05-24 that 
    public String toString() {
        return String.format("사각형[가로=%d, 세로=%d]", width, height);
    }

    public int compareTo(Rectangle o) {
        return findArea() - o.findArea();
    }
}


// TODO: 2023-05-24 what 
public class ComparableDemo {
    public static void main(String[] args) {
        Rectangle[] rectangles = {new Rectangle(3,5),
        new Rectangle(2,10), new Rectangle(5,5)};

        Arrays.sort(rectangles);             // Arrays 주의

        for (Rectangle r : rectangles)
            System.out.println(r);
    }
}
