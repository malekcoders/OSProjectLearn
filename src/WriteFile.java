import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteFile {

    public static void writeFile(String filePath, String content) throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream(filePath);
        byte[] contentInBytes = content.getBytes();
        try {
            file.write(contentInBytes);
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) throws FileNotFoundException {

        writeFile("src/note.txt", "Hello World!");
    }
}
