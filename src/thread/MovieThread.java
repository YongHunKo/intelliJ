package thread;

public class MovieThread extends Thread{
    // �����带 ���������Ѵٴ� �� �����ְ����
    // �ƴϸ� ���� ����Ŭ�������� �ϳ����ؼ� �ص���
    @Override
    public void run(){
        for(int i= 0; i<3; i++){
            System.out.println("�������� ����մϴ�");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
