import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFile {

    public static void renameFile(String filePath, String newFileName) {
        Path path = Paths.get(filePath);
        path.toFile().renameTo(Paths.get(newFileName).toFile());
    }
    public static void main(String [] args) {
        String filePath = System.getProperty("user.dir") + "/src/note.txt";
        String newFileName = System.getProperty("user.dir") + "/src/newNote.txt";
        RenameFile.renameFile(filePath, newFileName);

    }
}
