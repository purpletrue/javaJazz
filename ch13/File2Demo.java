package ch13;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class File2Demo {
    public static void main(String[] args) throws Exception {
        Charset cs = Charset.defaultCharset();
        Path p = new File("D:\\Temp\\new.txt").toPath();

        if(Files.notExists(p))
            Files.createFile(p);

        byte[] data = "좋은 아침\n잘 가세요!\n".getBytes();
        Files.write(p, data, StandardOpenOption.APPEND);

        try {
            List<String> lines = Files.readAllLines(p, cs);

            for (String line : lines)
                System.out.println(line);
        } catch (IOException e) {
        }

    }
}
