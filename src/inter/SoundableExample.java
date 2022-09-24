package inter;

public class SoundableExample {
    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        // 여기 이말뜻은 printSound메소드를 발동시키는데
        // new Cat()을 대입시킨다
        // 즉 Soundable soundable = new Cat 이라는 객체를 생성하겠다는 말이랑 똑같은말
        printSound(new Dog());
        //2. 여기까지 주어진 예제문, 우리의 목표는 Cat과 Dog를 처리하는 것
    }
}
