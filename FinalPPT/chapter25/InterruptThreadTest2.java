
public class InterruptThreadTest2 {
    // 메시지 출력 메서드
    static void message(String message) {
        String name = Thread.currentThread().getName();
        System.out.format("%s: %s%n", name, message);
    }

    // 스레드 작업 클래스
    private static class MessageLoop implements Runnable {
        public void run() {
            String[] importantInfo = {"Message 1", "Message 2", "Message 3"};
            try {
                for (String info : importantInfo) {
                    Thread.sleep(4000); // 4초 대기
                    message(info);
                }
            } catch (InterruptedException e) {
                message("MessageLoop interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long patience = 10000; // 메인 스레드 대기 시간 (밀리초)
        message("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        message("Waiting for MessageLoop thread to finish");

        // 스레드가 종료될 때까지 대기
        while (t.isAlive()) {
            t.join(1000); // 1초 대기
            if ((System.currentTimeMillis() - startTime) > patience && t.isAlive()) {
                message("Patience exceeded. Interrupting MessageLoop thread.");
                t.interrupt(); // 스레드 종료 신호
                t.join(); // 스레드가 종료될 때까지 대기
            }
        }

        message("MessageLoop thread finished.");
    }
}
