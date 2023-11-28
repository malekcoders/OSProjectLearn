import java.io.*;
import java.nio.file.*;

public class FileInfo {

    public static void printFileInfo(Path filePath) throws IOException {

        var fileOwner = Files.getOwner(filePath);
        var fileType = Files.probeContentType(filePath);
        var fileZie = Files.size(filePath);
        var fileCreationTime = Files.getAttribute(filePath, "creationTime");
        var fileLastAccessTime = Files.getAttribute(filePath, "lastAccessTime");
        var fileLastModifiedTime = Files.getAttribute(filePath, "lastModifiedTime");

        System.out.println("File Name: "+filePath.getFileName());
        System.out.println("File Type: "+fileType);
        System.out.println("File Size: "+fileZie+" bytes");
        System.out.println("File Owner: "+fileOwner);
        System.out.println("File Creation Time: "+fileCreationTime);
        System.out.println("File Last Access Time: "+fileLastAccessTime);
        System.out.println("File Last Modified Time: "+fileLastModifiedTime);
        System.out.println("FIle path: "+filePath);

    }

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/note.txt");
        printFileInfo(path);

    }
}