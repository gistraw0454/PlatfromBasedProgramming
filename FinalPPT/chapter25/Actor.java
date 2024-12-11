import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Actor implements Runnable {
    private String name;
    private Counter counter;
    public List<Integer> getResults() {return results;}
    private List<Integer> results = new ArrayList<>();
    public Actor(String name, Counter counter){
    this.name = name; this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
        counter.increment(); results.add(counter.value());
        }
    }

    

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
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
class Counter {
        private int c = 0;
        public void increment() { c++; }
        public void decrement() { c--; }
        public int value() {return c; }
    }