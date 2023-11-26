import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void deleteFile(String filePath) throws IOException {
        Files.delete(Path.of(filePath));
    }
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/note.txt");
        Files.delete(path);

    }
}
