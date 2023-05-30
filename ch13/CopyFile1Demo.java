package ch13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile1Demo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";
        String output = "D:\\Temp\\dup.txt";

        try (FileReader fr = new FileReader(input);
             FileWriter fw = new FileWriter(output)) {
            int c;

            while ((c = fr.read()) != -1)
                fw.write(c);
        } catch (IOException e) {
        }
    }
}
