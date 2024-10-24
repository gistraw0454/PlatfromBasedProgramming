​	

```java
package hanoi;
//1. 마지막빼고 전부 tmp로 이동
//2. 마지막꺼는 end로 이동
//3. 남은걸 다시 end로 이동
public class Tower {
    private final int n;

    public Tower(int n) {
        this.n = n;
    }

    public void hanoiTower(int n, int start, int tmp, int end) {
        if (n==0){
            return;
        }
        else if (n == 1) {
            System.out.println(start + " " + end);
            return;
        }
        hanoiTower(n - 1, start, end, tmp);
        System.out.println(start + " " + end);
        hanoiTower(n - 1, tmp, start, end);
    }

    public void print() {
        double count = Math.pow(2, n) - 1;
        System.out.println((int)count);
        hanoiTower(n, 1, 2, 3);
    }
}

```



```java
import java.util.Scanner;

public class Main
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
```

## 별찍기 with 다형성	

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Pattern pattern = new Pattern(new Pr2438(n), n);
        pattern.print();
    }
}

class Pattern {
    private final Line[] lines;

    public Pattern(LineFactory factory, int numOfLines) {
        lines = new Line[numOfLines];
        for (int i = 0; i < numOfLines; i++) {
            lines[i] = factory.create(i + 1);
        }
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }
}

interface LineFactory {  // 인터페이스 이름 수정
    int numOfLines();
    Line create(int lineNum);
}

class Line {
    private final List<Characters> charactersList;

    public Line(List<Characters> list) {
        this.charactersList = list;
    }

    public void print() {
        for (Characters characters : charactersList) {
            characters.print();
        }
        System.out.println();
    }
}

class Characters {
    private final int printNum;
    private final char character;

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

class Pr2438 implements LineFactory {
    private final int input;

    public Pr2438(int input) {
        this.input = input;
    }

    @Override
    public int numOfLines() {
        return input;
    }

    @Override
    public Line create(int lineNum) {
        int starNum = lineNum;
        int spaceNum = input - lineNum;
        List<Characters> charactersList = new ArrayList<>();

        charactersList.add(new Characters('*', starNum));
        charactersList.add(new Characters(' ', spaceNum));

        return new Line(charactersList);
    }
}

```

```java
import java.util.ArrayList;
import java.util.List;

public class Pr10991 implements LineFactory {
    int input;

    public Pr10991(int input) {
        this.input = input;
    }

    @Override
    public int numOfLines() {
        return input;
    }

    @Override
    public Line create(int lineNum) {
        int starNum = lineNum;
        int spaceNum = input - starNum;

        List<Characters> charactersList = new ArrayList<>();
        
        charactersList.add(new Characters('-', spaceNum));  // 왼쪽에 - 추가
        for (int i = 0; i < starNum; i++) {
            charactersList.add(new Characters('x', 1)); // n번째 줄에 x n개 출력
            if (i < starNum - 1) {
                charactersList.add(new Characters('-', 1));  // x하나 출력하고 - 출력
            }
        }
        charactersList.add(new Characters('-', spaceNum));  // 오른쪽에 - 추가
        return new Line(charactersList);
    }
}

```

```java
#include <iostream>
using namespace std;

int N;
bool board[3072][6144];

void fillStar(int x, int y, int n) {
    if(n == 3) {
        board[x-2][y+2] = true;
        board[x-1][y+1] = board[x-1][y+3] = true;
        for(int i=0; i<5; i++) board[x][y+i] = true;
        return;
    }
    fillStar(x - n/2, y + n/2, n/2);
    fillStar(x, y, n/2);
    fillStar(x, y + n, n/2);
}
void printStar() {
    for(int i=0; i<N; i++) {
        for(int j=0; j<2*N; j++)
            cout << (board[i][j] ? '*' : ' ');
        cout << '\n';
    }
}
int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> N;
    fillStar(N-1, 0, N);
    printStar();
}
```

