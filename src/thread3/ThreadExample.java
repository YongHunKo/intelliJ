package thread3;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.setDaemon(true);
        //thread객체를 데몬스레드로 만듬
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        // 문제의도 메인 스레드 종료시 MovieThread도 같이 종료하게 만들고싶다
        // = 데몬스레드를 사용해라
    }
}
