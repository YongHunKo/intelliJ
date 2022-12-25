package inflearn;

import java.util.Scanner;
//문제
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요
public class Main2 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x))//x의 대소문자를 확인해야함
                answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
