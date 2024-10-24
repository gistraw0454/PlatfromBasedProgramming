import java.util.*;

public class PrPr implements LineFactory{
    private final int input;

    public PrPr(int input) {
        this.input = input;
    }

    @Override
    public int numOfLines() {
        return input;
    }

    @Override
    public Line create(int lineNum) {
        List<Characters> charactersList = new ArrayList<>();
        String line = createFractalLine(lineNum, input);

        charactersList.add(new Characters(line, 1));  // 한 번만 출력하도록 리스트에 추가
        return new Line(charactersList);
    }

    // 프랙탈 라인을 재귀적으로 만드는 함수
    private String createFractalLine(int lineNum, int maxLines) {
        if (lineNum == 1) {
            return "*";  // 기본 삼각형의 꼭대기
        }
        String prevLine = createFractalLine(lineNum - 1, maxLines);
        StringBuilder currentLine = new StringBuilder();

        // 공백을 추가해서 프랙탈 삼각형 확장
        int spaces = (maxLines - lineNum);
        for (int i = 0; i < spaces; i++) {
            currentLine.append(" ");
        }

        // 이전 라인과 동일한 패턴을 추가해 확장된 구조
        currentLine.append(prevLine).append(" ").append(prevLine);

        return currentLine.toString();
    }
}
