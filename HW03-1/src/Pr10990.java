import java.util.ArrayList;
import java.util.List;

public class Pr10990 implements LineFactory {
    int input;

    public Pr10990(int input) {
        this.input = input;
    }

    @Override
    public int numOfLines() {
        return input;
    }

    @Override
    public Line create(int lineNum) {

        List<Characters> charactersList = new ArrayList<>();

        if (lineNum == 1){
            charactersList.add(new Characters('-',input-1));
            charactersList.add(new Characters('x',1));
            charactersList.add(new Characters('-',input-1));
        }
        else if(lineNum==input){
            charactersList.add(new Characters('x',2*input-1));
        }
        else {
            charactersList.add(new Characters('-', input - lineNum));
            charactersList.add(new CharactersWithStars(new Characters('-', 2 * lineNum - 3)));
            charactersList.add(new Characters('-', input - lineNum));
        }

        return new Line(charactersList);
    }
}

class CharactersWithStars extends Characters {
    private final Characters characters;

    public CharactersWithStars(Characters characters) {
        super(' ', 0);
        this.characters = characters;
    }

    @Override
    public void print() {
        System.out.print('x');
        characters.print();
        System.out.print('x');
    }
}
