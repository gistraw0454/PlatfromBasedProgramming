package Practice25.ThreadInterface;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) throws InterruptedException { Counter counter = new Counter();
        Actor actor1 = new Actor("Actor1", counter);
        Actor actor2 = new Actor("Actor2", counter);
        Thread t1 = new Thread(actor1); Thread t2 = new Thread(actor2);
        t1.start(); t2.start();
        t1.join(); t2.join();
        var stream = actor1.getResults().parallelStream();
        List<Integer> result = Stream.concat(stream, actor2.getResults().stream()).collect(Collectors.toList());
        System.out.println(result);
    }
}
