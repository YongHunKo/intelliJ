package thread2;

public class MovieThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("�������� ����մϴ�");
            if(Thread.interrupted()){
                break;
            }
        }
    }
}
