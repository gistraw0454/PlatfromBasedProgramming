import java.util.Arrays;

public class JavaMinMax
        implements MinMaxStrategy {
    public int getMin(int[] data) {
        int[] copied = Arrays.copyOf(data, data.length);
        Arrays.sort(copied) ;
        int min = copied[0] ;
        return min ;
    }
    public int getMax(int[] data) {
        int[] copied = Arrays.copyOf(data, data.length);
        Arrays.sort(copied) ;
        int max = copied[copied.length-1] ;
        return max ;
    }
}
