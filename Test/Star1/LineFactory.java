package Test.Star1;
//Pr10991 , Pr2438.. 그런것들을 하나의 type으로 만들자
public interface LineFactory {
    int numOfLines();
    Line create(int lineNum);
}
