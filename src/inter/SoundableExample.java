package inter;

public class SoundableExample {
    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        // ���� �̸����� printSound�޼ҵ带 �ߵ���Ű�µ�
        // new Cat()�� ���Խ�Ų��
        // �� Soundable soundable = new Cat �̶�� ��ü�� �����ϰڴٴ� ���̶� �Ȱ�����
        printSound(new Dog());
        //2. ������� �־��� ������, �츮�� ��ǥ�� Cat�� Dog�� ó���ϴ� ��
    }
}
