import java.util.ArrayList;

public class FunctionInterfaceExample{
    public static void main(String[] args){
        List<Integer> list = map(Arrays.asList("lambdas","in","action"),(String s)->s.length());

    }
    public static <T,R> List<R> map(List<T> list, Function <T,R> f){
        List <R> result = new ArrayList<>();
        for (T t : list){
            result.add(f.apply(t));
        }
        return result;
    }
}

@FunctionalInterface
public interface Function<T,R>{
    R apply(T,t);
}