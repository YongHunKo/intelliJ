package thread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
        // 직접 쓰레드를 이용해서 직접 객체를 생성해서도 담을 수 있다.
    }
}
