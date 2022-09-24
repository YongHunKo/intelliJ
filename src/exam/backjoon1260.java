package exam;
// 완
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon1260 {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check; // 확인을 했는지 안했는지
    static int[][] arr; //간선 연결상태

    static int node, line, start;//노드는 점 개수, 라인은 간선개수, 스타트는 시작점

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start= Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];//좌표를 그대로 받아주려고 +1을 선언했고
        check = new boolean[node+1];// 초기값을 false로 줌

        for(int i = 0 ; i < line ; i ++) {// 간선 연결상태를 arr에 저장한다
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] =  1;
        }

        dfs(start); //dfs를 호출하고
        sb.append("\n");//줄바꿈을 위한 식
        check = new boolean[node+1];//확인상태를 초기화해서 다음 것을 확인할걸 대기함

        bfs(start);

        System.out.println(sb);

    }
    public static void dfs(int start) {
        //시작점을 변수로 받아 확인하고 출력 후에 다음 연결점을 찾아 시작점을 변경하면서 반복
        check[start] = true;
        sb.append(start + " ");

        for(int i = 0 ; i <= node ; i++) {
            if(arr[start][i] == 1 && !check[i])
                //둘이 같다면 i+1값으로 다음노드에 가고 아니면 dfs(i)가 실행
                dfs(i);
        }

    }

    public static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()) {
            //q가 비어있는것을 확인, 비어있는걸 확인하고 쭉 실행
            start = q.poll();
            sb.append(start + " ");

            for(int i = 1 ; i <= node ; i++) {
                if(arr[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }


    }

}
