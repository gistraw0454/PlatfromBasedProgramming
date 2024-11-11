import java.util.ArrayList; // 동적으로 크기가 변하는 배열을 제공
import java.util.List;

public class Line11 implements LineFactory {
    private final int n; // 라인 줄의 수 (final로 한 번 초기화되면 변화 x)

    public Line11(int n) {
        this.n = n;
    }

    @Override
    public List<Line> createLines() {
        List<Line> lines = new ArrayList<>(); // lines라는 ArrayList를 생성. Line 타입의 객체들을 저장하는 데 사용
        for (int i=0; i < n; i++) {
            int spaceCount = n - i - 1;
            int starCount = i + 1;

            lines.add(new Line2(spaceCount, starCount)); // 한 줄씩 생성하여 lines 리스트에 추가
        }
        return lines;
    }

}

class Line2 implements Line {
    private final int spaceCount;
    private final int starCount;

    public Line2(int spaceCount, int starCount) {
        this.spaceCount = spaceCount;
        this.starCount = starCount;
    }


    @Override
    public void print() {
        for (int i = 0; i < spaceCount; i++) {
            System.out.print("-");
        }
        for (int i = 0; i < starCount; i++) {
            System.out.print("x");
        }
        System.out.println();
    }
}