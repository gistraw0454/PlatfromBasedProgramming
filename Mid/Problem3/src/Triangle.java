import java.util.ArrayList;
import java.util.List;

public abstract class Triangle {
    protected int row, col;
    public Triangle(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public abstract void write(Board board);
}

class OneStarTriangle extends Triangle {
    public OneStarTriangle(int row, int col) {
        super(row, col);
    }

    @Override
    public void write(Board board) {
        board.write(row, col);
    }
}

class EvenTriangle extends Triangle {
    private int x, y;

    public EvenTriangle(int n, int row, int col) {
        super(row, col);
        this.x = (int) Math.pow(2, n + 1) - 3;
        this.y = (int) Math.pow(2, n) - 1;
    }

    @Override
    public void write(Board board) {
        for (int i = 0; i < x; i++) {
            board.write(row, col + i);
        }
        for (int i = 1; i < y; i++) {
            board.write(row + i , col + i);
            board.write(row + i , col + x - i - 1);


        }
    }
}

class OddTriangle extends Triangle {
    private int x, y;

    public OddTriangle(int n, int row, int col) {
        super(row, col);
        this.x = (int) Math.pow(2, n + 1) - 3;
        this.y = (int) Math.pow(2, n) - 1;
    }

    @Override
    public void write(Board board) {
        for (int i = 0; i < x; i++) {
            board.write(row + y - 1, col + i);
        }
        for (int i = 1; i < y; i++) {
            board.write(row + y - i - 1, col + i);
            board.write(row + y - i - 1, col + x - i - 1);
        }
    }
}

class CompositeTriangle extends Triangle {
    private List<Triangle> triangles = new ArrayList<>();

    public CompositeTriangle(int n, int row, int col) {
        super(row, col);
        int size = (int) Math.pow(2, n) - 1;

        if (n == 1) {
            triangles.add(new OneStarTriangle(row, col));
        }
        else if (n % 2 == 0) {
            triangles.add(new EvenTriangle(n, row, col));
            triangles.add(new CompositeTriangle(n - 1, row + 1, col + size / 2 + 1));
        }
        else {
            triangles.add(new OddTriangle(n, row, col));
            triangles.add(new CompositeTriangle(n - 1, row + size / 2, col + size / 2 + 1));
        }
    }

    @Override
    public void write(Board board) {
        for (Triangle triangle : triangles) {
            triangle.write(board);
        }
    }
}
