package thread2;

public class MovieThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("동영상을 재상합니다");
            if(Thread.interrupted()){
                break;
            }
        }
    }
}
