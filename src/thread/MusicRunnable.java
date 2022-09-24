package thread;

public class MusicRunnable extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("음악을 재생합니다");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }//인터페이스로도 가능
    }
}
