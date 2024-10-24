package Test.Star1;

public class Characters {
    private char character;
    private int printNum;

    public Characters(char character, int printNum) {
        this.character = character;
        this.printNum = printNum;
    }

    public void print(){
        for (int i=0; i<printNum;i++){
            System.out.print(character);
        }
    }
}
