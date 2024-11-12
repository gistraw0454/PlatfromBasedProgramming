class ArrayAlg{
    public static <T extends Comparable<T>> Pair<T> minmax (T[] a){
        T min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++){
            if (min.compareTo(a[i]) > 0){ min = a[i]; }
            if (max.compareTo(a[i]) < 0){ max = a[i]; }
        }
        return new Pair<T>(min, max);
    }
}

public class PairTest3 {
    public static void main(String[] args) {
        String[] words = {"cd","ab","Im","ef"};
        Pair <String> mm1 = ArrayAlg.minmax(words);
        System.out.println("min= "+mm1.getFirst()+" max= "+mm1.getSecond());

        Rectangle[] rectangles = {new Rectangle(0,0,10,10),new Rectangle(0,0,20,20)};
//        Pair <Rectangle> mm2 = ArrayAlg.<Rectangle>minmax(rectangles);
//        System.out.println("min= "+mm2.getFirst()+" max= "+mm2.getSecond());
    }
}
