import java.util.ArrayList;
import java.util.List;

public class Line12 implements LineFactory {
    private final int n;

    public Line12(int n) {
        this.n = n;
    }

    @Override
    public List<Line> createLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lines.add(new LineImpl(n));
        }
        return lines;
    }

    private static class LineImpl implements Line {
        private final int n;

        public LineImpl(int n) {
            this.n = n;
        }

        @Override
        public void print() {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < n; i++) {
                line.append("x-");
            }
            line.deleteCharAt(line.length() - 1); // 마지막 '-' 제거
            System.out.println(line.toString());
        }
    }
}
