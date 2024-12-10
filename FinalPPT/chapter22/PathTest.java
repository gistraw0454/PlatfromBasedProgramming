import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathTest {
    public static void main(String[] args) {
        // None of these methods requires that the file corresponding to the Path exists.
        // Microsoft Windows syntax
        Pathpath = Paths.get("C:\\home\\joe\\foo");
        // Linux syntax
        //Path path = Paths.get("/home/joe/foo");
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
        System.out.format("File exists: %s%n", Files.exists(path));
    }
}