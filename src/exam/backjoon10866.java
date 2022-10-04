package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
//덱
public class backjoon10866 {
    public static void main(String[] args) throws IOException {
        // 덱 = 양방향 큐
        // 한방향에서만 푸쉬 팝 시키던 큐를 개량하여 앞 뒤방향 큐를 할 수 있도록 만듬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String[] s = br.readLine().split(" ");

            // 첫 번째 단어에 대한 switch-case
            switch (s[0]) {

                case "push_front": {
                    //앞쪽에 푸쉬시킴
                    dq.addFirst(Integer.parseInt(s[1]));
                    break;
                }

                case "push_back": {
                    //뒤쪽에 푸쉬시킴
                    dq.addLast(Integer.parseInt(s[1]));
                    break;
                }

                case "pop_front": {
                    if (dq.isEmpty()) {
                        // 앞쪽을 팝 시킴
                        // 팝 시킬게 없으면 -1을 출력
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.pollFirst()).append('\n');
                    }
                    break;
                }

                case "pop_back": {
                    // 마찬가지로 뒤쪽을 팝 시킴
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.pollLast()).append('\n');
                    }
                    break;
                }

                case "size": {
                    // 해당 덱의 사이즈를 출력
                    sb.append(dq.size()).append('\n');
                    break;
                }

                case "empty": {
                    // 해당 덱에 저장된것이 없으면 1을 출력
                    // 하나라도 저장되어있으면 0을 출력력
                   if (dq.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;
                }

                case "front": {
                    // 덱 제일 앞에있는 것을 출력
                    // 아무것도 없을 시 -1 출력
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekFirst()).append('\n');
                    }
                    break;
                }

                case "back": {
                    // 똑같은 원리
                    // 덱 제일 뒤에 있는 것을 출력
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekLast()).append('\n');
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
