package exam;
import java.util.Queue;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//카드2
public class backjoon2164 {
    //Queue 라는 것을 알고 있는지에 대한 문제
    //먼저들어온 자료가 제일 먼저 나가는 알고리즘 (FIFO)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //버퍼드리더로 입력을 받고
        Queue<Integer> q = new LinkedList<>();
        //큐에 링크드리스트를 담는다
        int N = Integer.parseInt(br.readLine());
        //입력받은 값은 N에 담고
        for(int i = 1; i <= N; i++) {
            q.offer(i); //Queue에 자료를 입력하는 명령어 'offer'
        }
        //입력받은 N만큼 for문을 돌려 큐에 저장한다
        //6 입력시 Queue 내부에 1,2,3,4,5,6 순서대로 자료가 입력됨

        while(q.size() > 1) { //문제에서 맨 앞에 저장된 것을 버리고 그다음을 뒤로 보내라고 정의함
            q.poll();	// Queue에 자료를 버리는 명령어 'poll'
                        // 따라서 맨 앞의 원소를 버림
            q.offer(q.poll());	// 맨 앞의 원소를 버림과 동시에 버려진 원소를 맨 뒤에 삽입
        }
        //Queue의 길이만큼 while을 통해 해당작업 반복하고

        System.out.println(q.poll());	// 마지막으로 남은 원소 출력
    }
}       // 우리가 알게된 것--> Queue의 사용, FIFO라는 단어
        // stack - push, pop
        // queue - offer, poll