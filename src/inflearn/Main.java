package inflearn;

import java.util.Scanner;
//문제
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//
//문자열은 영어 알파벳으로만 구성되어 있습니다.
public class Main {
    public int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase();//3. 전부 대문자로 만들어버림
        t = Character.toUpperCase(t);//4. 마찬가지로 대문자로
        System.out.println(str+" "+t);// 5. 대문자로 바뀐것 확인
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t) //6. 인덱스로 접근하는 방법
//                answer++;
//        }
//
//        return answer;

        for(char x : str.toCharArray())//string을 문자배열로 나타내는 방법
            if(x==t)
                answer++;

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//1.읽어들이고
        char c = sc.next().charAt(0);//2.문자 하나만 가져와야함

        System.out.println(T.solution(str, c));
    }
}// 프로그래머스 방식 = solution 사용
