import java.io.*;


public class ReadFile {

    public static void readFile(String path) throws FileNotFoundException{
        FileInputStream file = new FileInputStream(path);
        try {
            int character;
            while ((character = file.read()) != -1) {
                System.out.print((char)character);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String filePath = System.getProperty("user.dir") + "/src/note.txt";
        readFile(filePath);
    }
}