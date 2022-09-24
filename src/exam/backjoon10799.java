package exam;
import java.util.*;
import java.io.*;
//¼è¸·´ë±â
public class backjoon10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for(int i=0; i<S.length();i++) {
            if(S.charAt(i) == '(') {
                stack.push('(');
                continue;
            }
            if(S.charAt(i) == ')') {
                stack.pop();
                if(S.charAt(i-1) == '(')
                    result += stack.size();
                else
                    result++;
            }
        }
        System.out.println(result + "\n");
        br.close();
    }
}
