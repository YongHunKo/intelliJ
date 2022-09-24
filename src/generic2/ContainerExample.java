package generic2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("홍길동","도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        // get 과 set 이 주어진거보니 private + getter, setter 를 넣어야함

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동",35);
        String name2 = container2.getKey();
        int age = container2.getValue();
    }
}
