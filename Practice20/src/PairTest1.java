class Pair<T> {
    public Pair() { first = null; second = null; } // Actually, this body is not necessary !
    public Pair(T first, T second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }
    private T first, second;
}

class Rectangle{
    private int width, height,x,y;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

public class PairTest1 {
    public static void main(String[] args) {
        Pair<String> strPair = new Pair<String>() ;
        strPair.setFirst("Name") ;
        strPair.setSecond("Value");
        System.out.println( strPair.getFirst() + " " + strPair.getSecond()) ;
        Pair<Rectangle> recPair = new Pair<Rectangle>() ;
        recPair.setFirst(new Rectangle(0, 0, 10, 10)) ;
        recPair.setSecond(new Rectangle(0, 0, 100, 100));
        System.out.println( recPair.getFirst() + " " + recPair.getSecond()) ;
    }
}