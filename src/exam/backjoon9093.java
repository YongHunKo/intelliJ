package exam;

import java.io.*;
import java.util.Stack;
//완
public class backjoon9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t --> 0){
            // 이걸 돌릴 횟수
            // t --; 랑 t > 0; 을 합친 것
            Stack<Character> stack = new Stack<>();
            String str = br.readLine() + "\n";
            for(char ch : str.toCharArray()){
                //String.toCharArray는 문자열을 하나하나 쪼개서 배열에 집어넣는 메소드
                //우리는 스택에 집어넣기때문에 배열 X
                if(ch == ' ' || ch == '\n'){
                    while (!stack.isEmpty()){
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                }
                else stack.push(ch);
            }
        }
        bw.flush();
    }
    // 문장에서 공백이나 개행을 만나기 전까지 stack에 데이터를 담고,
    //공백이나 개행을 만났을 때 스택에서 데이터를 꺼내 버퍼에 담는다.
    //꺼낸 후 현재위치값(공백이나 개행)을 버퍼에 담는다.
    //그리고 그 버퍼를 읽는다.
}
