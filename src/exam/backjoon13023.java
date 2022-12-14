package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//ABCDE -> 좀더 준비
public class backjoon13023 {
    // 이 문제는 DFS를 이용하여 풀어야함
    // 해당 분기로 갈 수 있는 노드들을 다 살펴보고 움직임
    // https://minhamina.tistory.com/50
    // N명이 있다
    // 문제의 의도는 어느점에서 시작해서 4번 선을 이을 수 있는지 => 그래서 depth는 4
    // 선을 잇는다 = 친구관계이다
    // 만약 A~Z까지 참가했어도
    // A와B가 친구로 연결되어있고 B와C가 .... D와E가 친구로 연결된 경우가 있는지만 판단하는 게 문제의도
    // 그래서 첫번째 예시는 서로 일직선으로 (=선형) 4번 이어져 있으므로 1이 출력
    // 두번째 예시는 이미지처럼 연결이 되어있다 0에서 시작하거나 4번에서 시작하면 4번의 선이 이어져 있으므로 1이 출력
    // 세번째 예시는 어느점에서 시작하더라도 선을 두개밖에 못 긋기 때문에 0
    // 네번째 예시는 앞선 이미지들처럼 그림을 그려서 보면
    // 7 3 4 에서 출발하는 것 빼고는 4개의 선이 그어지므로 1이 출력
    static ArrayList<Integer>[] list;
    // 어레이리스트로 각 노드들이 연결된게 누구인지 담음
    static boolean[] visited;
    // 왔던 곳인지를 반드시 판별해야하기 때문에 불린을 변수로 지정
    static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력하는 부분
        N = Integer.parseInt(st.nextToken());
        // 문제에서 사람 수 라고 정의
        M = Integer.parseInt(st.nextToken());
        // 친구관계의 수라고 정의
        list = new ArrayList[N];
        for(int i=0; i<N; i++) {
            list[i] = new ArrayList<>();
            //어레이리스트 배열에 N을 순서대로 넣는다
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            list[s].add(e);
            list[e].add(s);
            //예전에 설명했듯이 1->2로 가는 것과
            // 2->1로 가는게 같다는 것을 설정정 줘야한다
            // 1이랑 2랑 한쪽만 친구인 경우일 수가..없으니..?
        }

        for(int i=0; i<N; i++) {
            visited = new boolean[N];
            // for문을 돌려서 각 노드들을 방문했는지 판단을하고
            visited[i] = true;
            // 방문을 했던 곳인지 불린으로 판단하고
            dfs(i, 0);
            //dfs메소드로 가서 뎁스가 4인경우만 찾고 1을 출력
        }

        System.out.println(0);
        // 아닌경우는 dfs메소드가 끝나면 0 출력
    }

    private static void dfs(int num, int depth) {
        if(depth == 4) {
            System.out.println(1);
            System.exit(0);
        }

        for(int i=0; i<list[num].size(); i++) {
            int nextNum = list[num].get(i);
            if(visited[nextNum]) continue;
            //노드를 받아와서 계속 진행시키고
            visited[nextNum] = true;
            //마찬가지로 방문했던 곳인지 불린으로 판단
            dfs(nextNum, depth+1);
            //dfs를 nextNum값을 넣어 뎁스가 4가될떄까지 for문을 반복하여
            //4가 되면 위에서 1로 출력되어 탈출
            visited[nextNum] = false;
        }
    }
}