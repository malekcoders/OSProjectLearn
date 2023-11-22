import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void createFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Files.createFile(path);
    }

    public static void main(String[] args) throws IOException{

        CreateFile.createFile("src/note.txt");
    }
}
