import java.util.ArrayList;
import java.util.List;

public class Line11 implements LineFactory {
    private final int n;

    public Line11(int n) {
        this.n = n;
    }

    @Override
    public List<Line> createLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int dashCount = n - i - 1;
            int xCount = i + 1;
            lines.add(new LineImpl(dashCount, xCount));
        }
        return lines;
    }

    private static class LineImpl implements Line {
        private final int dashCount;
        private final int xCount;

        public LineImpl(int dashCount, int xCount) {
            this.dashCount = dashCount;
            this.xCount = xCount;
        }

        @Override
        public void print() {
            for (int i = 0; i < dashCount; i++) {
                System.out.print("-");
            }
            for (int i = 0; i < xCount; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
