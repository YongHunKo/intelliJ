package thread;

public class MovieThread extends Thread{
    // 쓰레드를 상속해줘야한다는 걸 보여주고싶음
    // 아니면 직접 실행클래스에서 하나로해서 해도됨
    @Override
    public void run(){
        for(int i= 0; i<3; i++){
            System.out.println("동영상을 재생합니다");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
