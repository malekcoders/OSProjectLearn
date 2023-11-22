import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AppendFile {

    public static void appendFile(String filePath, String content) throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream(filePath, true);
        byte[] contentInBytes = content.getBytes();
        try {
            file.write(contentInBytes);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args) throws FileNotFoundException {
        String fileDir = System.getProperty("user.dir") + "/src/note.txt";
        appendFile(fileDir, "Added value!\n");
    }
}
