package exam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//에디터 완
public class backjoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            leftStack.push(str.charAt(i));
        }

        int N  = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String cmd = br.readLine();
            switch (cmd.charAt(0)){
                case 'L': //커서를 왼쪽으로 한칸 옮김-> 왼쪽 스택에서 pop한 것을 오른쪽 스택에 push
                    if(leftStack.empty()) break;
                    //왼쪽이 비어있으면 break로 나가버림
                    rightStack.push(leftStack.pop());
                    break;
                case 'D': // 커서를 오른쪽으로 한칸 옮김-> 위와 반대로 오른쪽 스택에서 pop한 것을 왼쪽에
                    if(rightStack.empty()) break;
                    leftStack.push(rightStack.pop());
                    break;
                case 'B': // 커서 왼쪽 하나를 삭제함->그냥 왼쪽것을 팝시켜버린다는 개념
                    if(leftStack.empty()) break;
                    leftStack.pop();
                    break;
                case 'P':// 오른쪽 스택을 push
                    leftStack.push(cmd.charAt(2));
                    break;
            }
        }
        while(!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!rightStack.empty()){
            sb.append(rightStack.pop());
        }
        System.out.println(sb.toString());
    }
}