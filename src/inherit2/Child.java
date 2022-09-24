package inherit2;

public class Child extends Parent{
    private String name;

    public Child(){
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }

    public String getName() {
        // 게터 세터추가해서 부모에 한번 사용해보고 exam에서도 사용해볼 예정
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
