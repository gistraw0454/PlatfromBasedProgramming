import java.util.List;

public class Main {
    public static void main(String[] args) {
        TTest test = (List<String> list) -> list.isEmpty();
        test(test);
        test(List<String> list) -> list.isEmpty();
    }

    static void test(TTest t){

    }
}

@FunctionalInterface
interface TTest{
    boolean test(List<String> list);
}