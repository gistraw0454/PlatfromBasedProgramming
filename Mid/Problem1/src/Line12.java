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
            lines.add(new Line3(n,i+1));
        }
        return lines;
    }
}

class Line3 implements Line {
    private final int n;
    private final int lineNum;

    public Line3(int n,int lineNum) {
        this.n = n;
        this.lineNum = lineNum;
    }

    @Override
    public void print() {
        if (lineNum%2 == 0) System.out.print("-");
        for (int i = 0; i < n; i++) {
            System.out.print("x");
            if (i != n-1) {
                System.out.print("-");
            }
        }
        if (lineNum%2 != 0 && n != 1) System.out.print("-");
        System.out.println();
    }
}
