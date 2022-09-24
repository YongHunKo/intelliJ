package exam;
// 완
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//DFS, https://lotuus.tistory.com/89
public class backjoon2606_1 {
    static int count;
    static int computers;
    // 컴퓨터 개수
    static int pairs;
    // 네트워크에 연결되어 있는 컴퓨터 쌍의 수
    static boolean[] check;
    // 감염된 컴수
    static int[][] node;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        pairs = Integer.parseInt(br.readLine());

        count = -1;
        node = new int[computers +1][computers +1];
        check = new boolean[computers +1];
        for (int i = 0; i < pairs; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),"");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = node[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);
    }
    private static void dfs(int start){
        check[start] = true;
        // 1번 컴퓨터 감염 시작
        count++;
        // +1
        // 1 2 3 5 6
        for (int i = 1; i<= computers; i++){
            // 컴퓨터 개수만큼 돌릴거다
            if(node[start][i]==1 && !check[i]) {
                //start인 1번컴퓨터와 연결된 노드이면서, i번 컴퓨터가 감염되지 않았다면
                dfs(i);
                //i번 컴퓨터는 감염처리해서 dfs(i)로 저장
            }
        }
    }
}
