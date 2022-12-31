package inflearn;

import java.util.Scanner;

public class Main7 {
    public String solution(String str){
        String answer = "YES";
        str=str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1))
                return "NO";
        }//방법1

        String tmp = new StringBuilder(str).reverse().toString();//tmp가 뒤집어짐
        if(str.equalsIgnoreCase(tmp)) answer="NO"; //방법2 를 사용하려면 위에서 answer를 no로, 여기의 answer는 yes로 고쳐서 실행해준다

        return answer;
    }

    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}