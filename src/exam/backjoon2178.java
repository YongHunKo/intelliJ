package exam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon2178 {
// 완
    static int n;
    static int m;
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());// 행
        m = Integer.parseInt(st.nextToken());// 열

        arr = new int[n][m]; // 미로 지도크기를 n m 초기입력 두개로 설정
        visited = new boolean[n][m]; // 방문 여부->온적이 있다 없다 이므로 boolean
        visited[0][0] = true;

        for (int i = 0; i < n; i++) { // 지도 생성
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { x, y });

        // 이동 할 수 있는 가지 수, 동서남북
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, 1, 0, -1 };

        while (!q.isEmpty()) { // 큐에 들어간 좌표 탐색이 모두 끝날 때까지 반복
            int[] xy = q.poll();

            for (int i = 0; i < 4; i++) { // 동, 서, 남, 북 탐색
                int nextX = xy[0] + dx[i];
                int nextY = xy[1] + dy[i];

                // 다음 지점이 미로를 벗어나거나, 벽이거나, 이미 탐색을 한 좌표이면 무시
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || visited[nextX][nextY]
                        || arr[nextX][nextY] == 0) {
                    continue;
                }

                // 다음 탐색 지점을 큐에 추가
                q.add(new int[] { nextX, nextY });

                // 다음 탐색 지점 탐색처리
                visited[nextX][nextY] = true;

                // 다음 탐색 지점의 비용을 현재 좌표 + 1 로 변경
                arr[nextX][nextY] = arr[xy[0]][xy[1]] + 1;
            }
        }
    }
}