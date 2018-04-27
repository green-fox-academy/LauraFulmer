import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        System.out.println(countTheLines("my-file.txt"));
    }

    public static int countTheLines(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            System.out.println(Files.isReadable(filePath));

            List<String> lines = Files.readAllLines(filePath);
            int numberOfLines = lines.size();
            return(numberOfLines);

        } catch (IOException e) {
            int numberOfLines = 0;
            return(numberOfLines);
        }
    }
}
