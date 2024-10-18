import java.util.List;

public class Line {
    private final List<Characters> charactersList;

    public Line(List<Characters> charactersList){
        this.charactersList = charactersList;
    }

    public void print(){
        for (Characters characters: charactersList){
            characters.print();
        }
        System.out.println();
    }
}
