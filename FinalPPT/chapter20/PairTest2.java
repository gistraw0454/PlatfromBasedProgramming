class Pair<T extends Number & Serializable>{
    private T first, second;
    
    public Pair(){first = null;second = null;}
    public Pair(T first, T second){this.first = first;this.second = second;}
    public T getFirst(){return first;}
    public T getSecond(){return second;}
    public void setFirst(T newValue){first = newValue;}
    public void setSecond(T newValue){second = newValue;}
}

public class PairTest2{
    public static void main(String[] args){
        Pair<Integer> intPair = new Pair<Integer>();
        intPair.setFirst(1);
        intPair.setSecond(2);

        Pair<Float> floatPair = new Pair<Float>();
        floatPair.setFirst(1.1F);
        floatPair.setSecond(1.1F);
    }
}