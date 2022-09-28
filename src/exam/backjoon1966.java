package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.LinkedList;
//프린터 큐
public class backjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        // 테스트 케이스

        while (T-- > 0) {
        //T값만큼 while을 돌린다다
           StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); //문서 개수
            int M = Integer.parseInt(st.nextToken()); //우리가 궁금한 자료 위치

            LinkedList<int[]> q = new LinkedList<>();
            // 제네릭으로 int배열을 준 이유는 초기 위치와 중요도를 주기 위해서 줌
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
                // [초기 위치, 중요도]
                // 문서 개수 만큼 for문이 돌아가는 동시에 우리가 중요도를 입력하는데로 담아버림
                // 3 0
                // 5 8 9 이면
                // for문은 3회 돌것이고
                // 첫번째 돌때 5이라는 중요도가 같이 저장됨 -> [0, 5], [1, 8], [2, 9]
            }

            int count = 0;	// 출력 횟수

            while (!q.isEmpty()) {	// 링크드리스트가 비어있지 않으면 계속 돌린다

                int[] front = q.poll();	// 가장 첫 원소
                boolean isMax = true;	// front 원소가 가장 큰 원소인지를 판단하는 변수

                // 큐에 남아있는 원소들과 중요도를 비교
                for(int i = 0; i < q.size(); i++) {

                    // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                    if(front[1] < q.get(i)[1]) {

                        // 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        // front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
                        isMax = false;
                        break;
                    }
                }

                // front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
                if(isMax == false) {
                    continue;
                }

                // front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서다.
                count++;
                if(front[0] == M) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
                    break;
                }

            }

            sb.append(count).append('\n'); //그때의 횟수를 스트링빌더에 저장

        }
        System.out.println(sb);
    }

}
