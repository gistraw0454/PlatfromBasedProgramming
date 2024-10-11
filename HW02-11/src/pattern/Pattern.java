package pattern;

public class Pattern {
    private final Line[] lines;

    public Pattern(int n) {
        lines = new Line[2*n-1];
        for (int lineNum = 1; lineNum < 2*n; lineNum++) {
            lines[lineNum - 1] = new Line(n, lineNum);
        }
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern(5);
        pattern.print();
    }
}

class Line {
    private final Characters first;
    private final Characters mid;

    public Line(int n, int lineNum) {
        int spaceNum = Math.abs(n-lineNum);
        int starNum = n-spaceNum;

        first = new Characters('x', starNum);
        mid = new Characters('-',spaceNum);
    }

    public void print() {
        first.print();
        mid.print();




        System.out.println();
    }
}

class Characters {
    private final char character;
    private final int printNum;

    public Characters(char character, int printNum) {
        this.character = character;
        this.printNum = printNum;
    }

    public void print() {
        for (int i = 0; i < printNum; i++) {
            System.out.print(character);
        }
    }
}
