public class Pattern {
    private final Line[] lines;

    public Pattern(LineFactory factory) {
        lines = new Line[factory.numOfLines()];
        for (int i = 0; i < lines.length; ++i) {
            lines[i] = factory.create(i + 1);
        }
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }
}