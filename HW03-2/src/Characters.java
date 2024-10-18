public class Characters implements Content {
    private final char character;
    private final int printNum;

    public Characters(char character, int printNum) {
        this.character = character;
        this.printNum = printNum;
    }

    @Override
    public void print() {
        for (int i = 0; i < printNum; i++) {
            System.out.print(character);
        }
    }
}