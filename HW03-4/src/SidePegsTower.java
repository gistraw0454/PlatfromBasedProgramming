import javax.swing.text.AsyncBoxView;
import java.util.List;
import java.util.ArrayList;

interface Tower{
    public int move();
}

public class SidePegsTower implements Tower {
    List<Tower> towers = new ArrayList<Tower>();

    public SidePegsTower(int numDiscs) {
        if (numDiscs == 1) {
            towers.add(new SingleDiscTower('C', 'B'));
            towers.add(new SingleDiscTower('A', 'B'));
        } else if (numDiscs == 2) {
            towers.add(new SingleDiscTower('C', 'A'));
            towers.add(new SingleDiscTower('C', 'B'));
            towers.add(new SingleDiscTower('A', 'C'));
            towers.add(new SingleDiscTower('A', 'C'));
            towers.add(new SingleDiscTower('A', 'B'));
            towers.add(new SingleDiscTower('C', 'B'));
            towers.add(new SingleDiscTower('C', 'B'));
        } else {
            towers.add(new SidePegsTower(numDiscs - 2));  // 중간으로 하나씩 옮기기 +2
            towers.add(new SingleDiscTower('C', 'A'));    // C를 A로 하나 옮기기 +1
            towers.add(new MultiDiscsTower(numDiscs - 2, 'B', 'C', 'A')); // 뭉탱이1개(2개)를 B에서 A로 옮기기
            towers.add(new SingleDiscTower('C', 'B'));    // C를 B로 하나 옮기기 +1
            towers.add(new MultiDiscsTower(numDiscs - 1, 'A', 'B', 'C')); // 뭉탱이2개(4개)를 A에서 C로 옮기기
            towers.add(new SingleDiscTower('A', 'B'));
            towers.add(new MultiDiscsTower(numDiscs - 1, 'C', 'A', 'B'));
        }
    }

    @Override
    public int move() {
        int sum = 0;
        for (Tower tower : towers) {
            sum += tower.move();
        }
        return sum;
    }
}


class SingleDiscTower implements Tower {
    private char from;
    private char to;

    public SingleDiscTower(char from, char to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int move() {
        System.out.println("Move disc from " + from + " to " + to);
        return 1;
    }
}

class MultiDiscsTower implements Tower {
    private int numDiscs;   //몇 뭉탱?
    private char from;
    private char aux;
    private char to;


    public MultiDiscsTower(int numDiscs, char from, char aux, char to) {
        this.numDiscs = numDiscs;
        this.from = from;
        this.aux = aux;
        this.to = to;
    }

    @Override
    public int move() {
        if (numDiscs == 1) {    // 1 뭉탱이면?
            return 2;
        } else {
            int moves1 = new MultiDiscsTower(numDiscs - 1, from, to, aux).move();
            int moves3 = new MultiDiscsTower(numDiscs - 1, aux, from, to).move();
            return moves1 + 2+ moves3;
        }
    }
}
