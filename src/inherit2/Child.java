package inherit2;

public class Child extends Parent{
    private String name;

    public Child(){
        this("ȫ�浿");
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }

    public String getName() {
        // ���� �����߰��ؼ� �θ� �ѹ� ����غ��� exam������ ����غ� ����
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
