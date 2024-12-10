public class FileListTest {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        File f = new File(currentDir);
        if(!f.exists() || !f.isDirectory()) {
            System.out.println("Invalid directory!");
            System.exit(0);
        }
        File[] files = f.listFiles();
        for(int i=0; i < files.length; i++) {
            String fileName = files[i].getName();
            System.out.println(
            files[i].isDirectory() ? "["+fileName+"]" : fileName);
        }
    }
}