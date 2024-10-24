package Test;

import java.util.Scanner;

public class StarButterfly
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Pattern pattern = new Pattern(n);
        pattern.print();

    }
}

class Pattern{
    private final Line[] lines;


    //생성자
    public Pattern(int n){
        lines = new Line[2*n-1];    // Line 타입 배열 초기화
        for (int lineNum=1; lineNum <2*n; lineNum++){
            lines[lineNum-1] = new Line(n,lineNum); //lineNum-1에 새 Line 객체 넣기
        }
    }

    //print()
    public void print(){
        for (Line line : lines) line.print();   // line하나씩 출력하기기
    }

}

class Line{
    private final Characters first;
    private final Characters mid;
    private final Characters last;

    //생성자
    public Line(int n, int lineNum){
        int spaceNum = Math.abs((n-lineNum)*2);
        int starNum = (n*2-spaceNum)/2;

        first = new Characters('*',starNum);
        mid = new Characters(' ',spaceNum);
        last = new Characters('*',starNum);
    }

    //print()
    public void print(){
        first.print();
        mid.print();
        last.print();
        System.out.println();   //'\n'
    }
}

class Characters{
    private final char character;
    private final int printNum;

    public Characters(char character,int printNum){
        this.character = character;
        this.printNum = printNum;
    }

    public void print(){
        for (int i=0; i< printNum; i++){
            System.out.print(character);
        }
    }
}
