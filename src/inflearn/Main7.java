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
        }//���1

        String tmp = new StringBuilder(str).reverse().toString();//tmp�� ��������
        if(str.equalsIgnoreCase(tmp)) answer="NO"; //���2 �� ����Ϸ��� ������ answer�� no��, ������ answer�� yes�� ���ļ� �������ش�

        return answer;
    }

    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}