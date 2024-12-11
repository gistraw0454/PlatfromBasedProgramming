import java.util.Scanner;
public class InterruptThreadTest{
    private static class SimpleRunnable implements Runnable{
        public void run(){
            String threadName = Thread.currentThread().getName();
            int i =0;
            while(!Thread.interrupted()){
                System.out.println(threadName+i);
                i++;
            }
        }
    }

    public static void main(String[] args){
        Thread thread = new Thread(new SimpleRunnable());
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        thread.interrupt();
    }
}