import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {
    public static void deleteFile(String filePath) throws IOException {
        Files.delete(Path.of(filePath));
    }
    public static void main(String[] args) throws IOException {
        String fileDir = System.getProperty("user.dir") + "/src/test";
        deleteFile(fileDir);

    }
}
