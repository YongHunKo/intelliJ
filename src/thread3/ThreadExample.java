package thread3;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.setDaemon(true);
        //thread��ü�� ���󽺷���� ����
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        // �����ǵ� ���� ������ ����� MovieThread�� ���� �����ϰ� �����ʹ�
        // = ���󽺷��带 ����ض�
    }
}
