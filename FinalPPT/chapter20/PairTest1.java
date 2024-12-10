class Pair<T>{
    private T first, second;
    
    public Pair(){
        first = null;
        second = null;
    }
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public void setFirst(T newValue){
        first = newValue;
    }
    public void setSecond(T newValue){
        second = newValue;
    }
}

public class PairTest1{
    public static void main(String[] args){
        Pair<String> strPair = new Pair<String> ();
        strPair.setFirst("name");
        strPair.setSecond("val");

        Pair<Rectangle> recPair = new Pair<Rectangle>();    // template type이 rectangle인 Pair 객체 생성
        recPair.setFirst(new Rectangle(0,0,10,10));
        recPair.setSecond(new Rectangle(0,0,100,100));
    }
}