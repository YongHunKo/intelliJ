package generic3;

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("È«±æµ¿",35);
        Integer age = Util.getValue(pair,"È«±æµ¿");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("È«»ï¿ø",20);
        Integer childAge = Util.getValue(childPair,"È«»ï¼ø");
        System.out.println(childAge);
    }
}
