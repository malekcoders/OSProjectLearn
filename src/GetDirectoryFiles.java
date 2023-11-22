import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetDirectoryFiles {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.dir") + "/src");

        // Check if the directory exists
        if (Files.exists(path) && Files.isDirectory(path)) {
            // Print the files in the directory
            try {
                for(Path file : Files.list(path).toArray(Path[]::new)){
                    System.out.println(file.getFileName());
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Directory does not exist!");
        }
    }
}