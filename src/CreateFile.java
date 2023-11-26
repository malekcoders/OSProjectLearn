import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

    public static void main(String[] args) throws IOException{
        /* You Code Here */
        Path path = Paths.get("src/notenote.txt");
        Files.createFile(path);
    }
}
