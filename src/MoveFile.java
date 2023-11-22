import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile {

    public static void moveFile(String filePath, String newFileName) throws IOException {
        Files.move(Paths.get(filePath), Paths.get(newFileName));
    }
    public static void main(String [] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/note.txt";
        String newFileName = System.getProperty("user.dir") + "/src/newNote.txt";
        MoveFile.moveFile(filePath, newFileName);

    }
}
