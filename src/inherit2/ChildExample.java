package inherit2;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.nation);// 부모의 있는 nation을 땡겨쓰기 가능
        System.out.println(child.getName());
    }
}
