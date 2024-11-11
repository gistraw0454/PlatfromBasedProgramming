import java.util.ArrayList;
import java.util.List;

public class MultiDiscsTower implements Tower {
    private int numDiscs;
    List<Tower> towers = new ArrayList<Tower>();

    MultiDiscsTower(int numDiscs) {
        this.numDiscs = numDiscs;

        if (numDiscs == 1){
            towers.add(new SingleDiscTower(1,3));
        }
        else if (numDiscs==2){
            towers.add(new SingleDiscTower(1,3));
            towers.add(new SingleDiscTower(1,2));
            towers.add(new SingleDiscTower(3,1));
            towers.add(new SingleDiscTower(2,3));
            towers.add(new SingleDiscTower(1,3));
        }
        else{
            towers.add(new MultiDiscsTower(numDiscs-1));
            towers.add(new SingleDiscTower(1,2));
            towers.add(new MultiDiscsTower(numDiscs-1));
            towers.add(new SingleDiscTower(2,3));
            towers.add(new MultiDiscsTower(numDiscs-1));
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
    private int from;
    private int to;

    public SingleDiscTower(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int move() {
        return (int)Math.abs(from-to);
    }
}


