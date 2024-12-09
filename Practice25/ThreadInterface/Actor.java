package Practice25.ThreadInterface;

import java.util.ArrayList;
import java.util.List;

class Counter {
    private int c = 0;
    public void increment() { c++; }
    public void decrement() { c--; }
    public int value() {return c; }
}

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
            counter.increment();
            results.add(counter.value());
        }
    }}

