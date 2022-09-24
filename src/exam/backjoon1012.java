package exam;
// 완
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon1012 {
    static int M;
    static int N;
    static int K;
    static int arr[][];

    static int visited[][];

    static int list[] = new int[2601];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(br.readLine());

        for (int tc=1; tc<=T; tc++) {
            int ANSWER = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.valueOf(st.nextToken());
            N = Integer.valueOf(st.nextToken());
            K = Integer.valueOf(st.nextToken());

            arr = new int[N][M];
            visited = new int[N][M];

            for(int i = 1; i<= K; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.valueOf(st.nextToken());
                int y = Integer.valueOf(st.nextToken());

                arr[y][x] = 1;
            }
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(visited[i][j]==0&&arr[i][j]==1){
                        ANSWER++;
                        bfs(i,j);
                    }
                }
            }
            System.out.println(ANSWER);
        }

    }

    private static void bfs(int i, int j) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(i*100 + j);
        visited[i][j] = 1;

        int pos = 0;
        while (q.isEmpty() == false){
            pos = q.poll();
            j= pos;
            j= pos%100;

            if(i > 0 && arr[i-1][j]==1 && visited[i-1][j]==0){
                visited[i-1][j]=1;
                q.offer((i-1)*100+j);//상 , 위로
            }
            if(i < N-1 && arr[i+1][j]==1 && visited[i+1][j]==0){
                visited[i+1][j]=1;
                q.offer((i+1)*100+j);// 하,
            }
            if(j > 0 && arr[i][j-1]==1 && visited[i][j-1]==0){
                visited[i][j-1]=1;
                q.offer(i*100+(j-1));// 왼쪽
            }
            if(j < M-1 && arr[i][j+1]==1 && visited[i][j+1]==0){
                visited[i][j+1]=1;
                q.offer(i*100+(j+1));// 오른쪽
            }
        }


    }
}


