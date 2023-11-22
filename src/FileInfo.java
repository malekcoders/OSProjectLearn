import java.io.*;
import java.nio.file.*;

public class FileInfo {

    public static void printFileInfo(String filePath) throws IOException {

        Path path = Paths.get(filePath);

        var fileOwner = Files.getOwner(path);
        var fileType = Files.probeContentType(path);
        var fileZie = Files.size(path);
        var fileCreationTime = Files.getAttribute(path, "creationTime");
        var fileLastAccessTime = Files.getAttribute(path, "lastAccessTime");
        var fileLastModifiedTime = Files.getAttribute(path, "lastModifiedTime");

        System.out.println("File Name: "+path.getFileName());
        System.out.println("File Type: "+fileType);
        System.out.println("File Size: "+fileZie+" bytes");
        System.out.println("File Owner: "+fileOwner);
        System.out.println("File Creation Time: "+fileCreationTime);
        System.out.println("File Last Access Time: "+fileLastAccessTime);
        System.out.println("File Last Modified Time: "+fileLastModifiedTime);
        System.out.println("FIle path: "+path);

    }

    public static void main(String[] args) throws IOException {

        String fileDir = System.getProperty("user.dir") + "/src/note.txt";

        printFileInfo(fileDir);

    }
}