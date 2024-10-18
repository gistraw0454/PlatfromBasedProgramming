import java.util.ArrayList;
import java.util.List;

public class Pr10991 implements LineFactory {
    int input;

    public Pr10991(int input) {
        this.input = input;
    }

    @Override
    public int numOfLines() {
        return input;
    }

    @Override
    public Line create(int lineNum) {
        int starNum = lineNum;
        int spaceNum = input - starNum;

        List<Characters> charactersList = new ArrayList<>();

        charactersList.add(new Characters('-', spaceNum));  // 왼쪽에 - 추가
        for (int i = 0; i < starNum; i++) {
            charactersList.add(new Characters('x', 1)); // n번째 줄에 x n개 출력
            if (i < starNum - 1) {
                charactersList.add(new Characters('-', 1));  // x하나 출력하고 - 출력
            }
        }
        charactersList.add(new Characters('-', spaceNum));  // 오른쪽에 - 추가

        return new Line(charactersList);
    }
}
