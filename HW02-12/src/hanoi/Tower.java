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
