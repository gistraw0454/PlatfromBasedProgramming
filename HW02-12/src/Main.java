import hanoi.Tower;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Tower tower = new Tower(n);
        tower.print();

    }
}