package locker;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddFile{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\LENOVO\\Downloads\\text1.txt");

        Files.createDirectories(path.getParent());
        System.out.println("File Created");

        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.err.println("already exists: " + e.getMessage());
            System.out.println("File not created");
        }
    }
}
