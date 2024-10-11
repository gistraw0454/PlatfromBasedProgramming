package pattern;

import javax.xml.stream.events.Characters;

public class Pr2438 implements LineFactory{
    int input;

    public Pr2438(int input){
        this.input = input;
    }

    @Override
    public int numOfLines(){return input;}

    @Override
    public Line create(int lineNum){
        int starNum = lineNum;
        int spaceNum = input - starNum;

        List<Content> charactersList = new ArrayList<Content>();
        charactersList.add(new Characters('x',starNum));
        charactersList.add(new Characters('-',spaceNum));

        return new Line(charactersList);
    }
}
