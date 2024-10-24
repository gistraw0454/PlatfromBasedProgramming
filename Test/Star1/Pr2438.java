package Test.Star1;
import java.util.*;
public class Pr2438 implements LineFactory{
    int length;
    int input;

    public Pr2438(int input){
        this.length = input;
        this.input = input;
    }

    @Override
    public int numOfLines(){
        return input;   // line 개수가 n인 경우
    }

    @Override   //interface구현하기
    public Line create(int lineNum){
        int starNum = lineNum;
        int spaceNum = input - lineNum;
        List<Characters> charactersList = new ArrayList<>();

        charactersList.add(new Characters('*',starNum));
        charactersList.add(new Characters(' ',spaceNum));
        return new Line(charactersList);
    }

}
