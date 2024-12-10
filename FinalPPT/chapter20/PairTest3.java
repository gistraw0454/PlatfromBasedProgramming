class Pair<T> {
    private T first;
    private T second;

    // 생성자
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Getter 메서드
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

class ArrayAlg {
    public static <T extends Comparable<T>> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        T min = a[0];
        T max = a[0];
        for (T element : a) {
            if (min.compareTo(element) > 0) min = element;
            if (max.compareTo(element) < 0) max = element;
        }
        return new Pair<>(min, max);
    }
}

public class PairTest3 {
    public static void main(String[] args) {
        String[] words = {"cd", "ab", "lm", "ef"};
        Pair<String> mm = ArrayAlg.minmax(words);

        // 결과 출력
        System.out.println("Min: " + mm.getFirst());  // 최소값 출력
        System.out.println("Max: " + mm.getSecond()); // 최대값 출력
    }
}