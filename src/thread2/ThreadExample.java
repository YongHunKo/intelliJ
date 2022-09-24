package thread2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            thread.interrupt();
            // 그대로 실행하면 예외가 생기지않음
            // 그래서 if로 thread.interrupt 실행만 되도 true 값을 줘서 예외가 발생하도록 만들어줌
        }
    }
}
