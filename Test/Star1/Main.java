package Test.Star1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Pattern pattern = new Pattern(new Pr2438(n),n);
        pattern.print();
    }
}
