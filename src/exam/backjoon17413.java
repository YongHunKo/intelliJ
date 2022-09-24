package exam;
import java.util.*;
import java.io.*;
// 단어뒤집기2
public class backjoon17413 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        int len = str.length();

        //꺽새가 있는지 없는지 검사
        boolean tag = false;
        for(int i=0; i<len; i++) {

            // 태그가 시작표시가 나왔을 때,
            // stack이 비어있지 않을 때,
            // stack 안에 있는 문자들을 모두 꺼냄
            if(str.charAt(i) == '<') {
                tag = true;

                while( !stack.isEmpty() ) {
                    sb.append(stack.pop());
                }

                sb.append(str.charAt(i));
            }
            else if(str.charAt(i) == '>') {
                tag = false;
                sb.append(str.charAt(i));
            }
            // 태그안 문자열 일때,
            // 태그 내부 문자열은 그대로 출력
            else if(tag == true) {
                sb.append(str.charAt(i));
            }
            // 태그가 아닐 때,
            else if( tag == false) {
                if(str.charAt(i) == ' ') {

                    while( !stack.isEmpty() ) {
                        sb.append(stack.pop());
                    }

                    sb.append(str.charAt(i));
                }
                // 공백이 아닐경우, 공백을 만날 때 까지 stack에 push
                else {
                    stack.push(str.charAt(i));
                }
            }
        }

        // 마지막 문자열이 남아있는지 체크
        while( !stack.isEmpty() ) {
            sb.append(stack.pop());
        }

        System.out.println(sb);


    } // End of main
} // End of class
