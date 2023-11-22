import java.io.*;
import java.nio.file.*;

public class FileInfo {
    public static void printFileInfo(String filePath) throws IOException {
        /* Do your code here, and apply the changes to the code below*/
        var fileName = "";
        var fileOwner = "";
        var fileType = "";
        var fileZie = "";
        var fileCreationTime = "";

        System.out.println("File Name: "+fileName);
        System.out.println("File Type: "+fileType);
        System.out.println("File Size: "+fileZie+" bytes");
        System.out.println("File Owner: "+fileOwner);
        System.out.println("File Creation Time: "+fileCreationTime);
        System.out.println("FIle path: "+path);
    }

    public static void main(String[] args) throws IOException {

        String fileDir = System.getProperty("user.dir") + "/src/note.txt";

        printFileInfo(fileDir);

    }
}