import java.io.File;
import java.io.InputStream;

public class ProcessBuilderTest {
    public static void main(String[] args) {
        try {
            String param = "C:" + File.separator; // Windows 디렉토리 경로
            Process proc = new ProcessBuilder("cmd", "/c", "dir", param).start();

            InputStream in = proc.getInputStream(); // proc로부터 input을 읽어옴
            byte buffer[] = new byte[1024];

            int n = -1;
            while ((n = in.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, n)); // 결과 출력
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
