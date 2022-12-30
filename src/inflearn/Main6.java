package inflearn;

import java.util.Scanner;

public class Main6 {
    public String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i)
                answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}