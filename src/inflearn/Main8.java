package inflearn;

import java.util.Scanner;

public class Main8 {
    public String solution(String s){
        String answer = "NO";
        s=s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";

        return answer;
    }

    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}