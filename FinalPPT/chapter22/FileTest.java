public class FilesTest {
    public static void main(String[] args) {
        Path path = Paths.get("", "src", "main", "java", "FilesTest.java");
        if (Files.exists(path) && !Files.notExists(path))
            System.out.println("File is existed!");
        if (Files.isDirectory(path))
            System.out.println("It is a directory!");
        if (Files.isRegularFile(path))
            System.out.println("It is a file!");
        if (Files.isReadable(path))
            System.out.println("It is readable!");
        if (Files.isWritable(path))
            System.out.println("It is writable!");
    }
}

public class CopyFileTest {
    public static void main(String[] args) {
        Path src = Paths.get("", "src", "main", "java", "CopyFileTest.java");
        Path dst = Paths.get("",  "CopyFileTest.java");
        CopyOption[] options = {StandardCopyOption.REPLACE_EXISTING};
        if (!Files.isDirectory(src) && Files.exists(src)){
            try {
                Files.copy (src, dst, options);
            } catch (FileAlreadyExistsException e) {
                System.err.println(e);
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
