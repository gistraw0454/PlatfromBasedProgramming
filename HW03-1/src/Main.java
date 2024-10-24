import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        Pattern pattern = new Pattern(new PrPr(n),n);
        pattern.print();
    }
}