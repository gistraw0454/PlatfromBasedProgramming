public class HelloRunnable implements Runnable{ // runnable interface의 run을 구현하자.
    public void run(){
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args){
        (new Thread(new HelloRunnable())).start();
    }
}