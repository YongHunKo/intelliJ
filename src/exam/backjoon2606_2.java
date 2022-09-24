package exam;
// 완
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon2606_2 {
    static int[][] node;
    static boolean[] check;
    // 감염 여부 확인
    static int count = 0;
    // 감염된 컴퓨터 수
    static Queue<Integer> q = new LinkedList<>();
    static int computers;
    static int pairs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        pairs = Integer.parseInt(br.readLine());

        node = new int[computers+1][computers+1];
        check = new boolean[computers+1];
        for(int i = 0; i < pairs; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),"");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = node[b][a] = 1;
            // 1, 2 나 2, 1이 같으므로 = 방향성이 없다
        }
        bfs(1);
        // 결론적으로 1번만 호출되고, 노드를 탐색하면서
        // 다음에 어떤 노드를 탐색할 것인지 q에 저장
        // 현재 노드 탐색이 끝나면 q에 저장해둔 노드를 꺼내어 탐색
        System.out.println(count);
    }

    // 1 2 5 3 6
    public static void bfs(int start){
        q.offer(start);
        check[start] = true;
        // 1번 컴퓨터 = start
        while (!q.isEmpty()){
            int temp = q.poll();
            for(int i = 0; i <= computers; i++){
                if(node[temp][i]==1 && !check[i]){
                    q.offer(i);
                    check[i] = true;
                    count++;
                }
            }
        }
    }
}
