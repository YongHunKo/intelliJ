package inter;

public class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";
        // 3.간단하게 Soundable에 있는 sound()추상메소드를
        // 재정의해서 쓰면 되기때문에 땡겨오고
        // 리턴값으로 "야옹"을 줌
    }

}
