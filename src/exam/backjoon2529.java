package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
//부등호
public class backjoon2529 {
    //브루트 포스+DFS 예제
    //간단하다 노드 9개를 연결 시키는 경우를 구하라는 것이다
    //앞에서부터 1~9를 넣으면서 끝까지 부등호에 만족하는 숫자들이 들어갈텐데
    //그중에서 부등호를 없애고 합쳐진 숫자들 중 최대값과 최소값을 출력하라는 문제
    static int n;
    static boolean[] visited;
    static String[] arr;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");

        visited = new boolean[10];

        // param1 : 리턴받을 문자열, param2: 인덱스(0부터시작)
        dfs("",0);

        //최대값
        System.out.print(list.get(list.size() - 1) + "\n");
        //최소값
        System.out.print(list.get(0));

    }
    static void dfs(String num, int idx) {
        // 주어진 부등호의 모든 조건을 완성하면 리턴
        if(idx == n+1) {
            // 부등호가 성립되는 모든 경우의 수가 등록됨
            list.add(num);
            return;
        }

        // 0~9 까지의 수
        for(int j = 0 ; j < 10; j++) {
            // 사용한 숫자인지 체크
            if(visited[j]) {
                continue;

            }
            // Character.getNumericValue : char -> int 형으로 변환 (선택한 숫자)
            // j , arr[idx-1] : 선택한 숫자에 비교할 숫자와, 비교할 부등호
            if(idx == 0 || ckeck(Character.getNumericValue(num.charAt(idx - 1)), j , arr[idx-1])) {
                visited[j] = true;
                // true일시, num에 문자열 붙임
                dfs(num+j, idx+1);
                visited[j] = false;
            }
        }

    }

    static boolean ckeck(int a, int b, String c) {
        // 현재 사용하는 숫자와 j번째 숫자와 비교하여, 부등호가 성립되면 true
        if (c.equals(">")) {
            if(a < b) return false;
        } else if (c.equals("<")){
            if(a > b) return false;
        }
        return true;
    }



}

