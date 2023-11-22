import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetDirectoryFiles {
    public static boolean getDirectoryFiles(String filePath){
        Path path = Paths.get(filePath);

        File directory = path.toFile();

        if (directory.exists() && directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Directory does not exist!");
        }
        if(directory.listFiles().length == 0)
            return false;
        else if(directory.listFiles().length > 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String fileDir = System.getProperty("user.dir") + "/src/folder";
        boolean isEmpty = GetDirectoryFiles.getDirectoryFiles(fileDir);
        System.out.println(isEmpty);
    }
}