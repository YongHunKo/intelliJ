package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
//�ε�ȣ
public class backjoon2529 {
    //���Ʈ ����+DFS ����
    //�����ϴ� ��� 9���� ���� ��Ű�� ��츦 ���϶�� ���̴�
    //�տ������� 1~9�� �����鼭 ������ �ε�ȣ�� �����ϴ� ���ڵ��� ���ٵ�
    //���߿��� �ε�ȣ�� ���ְ� ������ ���ڵ� �� �ִ밪�� �ּҰ��� ����϶�� ����
    static int n;
    static boolean[] visited;
    static String[] arr;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");

        visited = new boolean[10];

        // param1 : ���Ϲ��� ���ڿ�, param2: �ε���(0���ͽ���)
        dfs("",0);

        //�ִ밪
        System.out.print(list.get(list.size() - 1) + "\n");
        //�ּҰ�
        System.out.print(list.get(0));

    }
    static void dfs(String num, int idx) {
        // �־��� �ε�ȣ�� ��� ������ �ϼ��ϸ� ����
        if(idx == n+1) {
            // �ε�ȣ�� �����Ǵ� ��� ����� ���� ��ϵ�
            list.add(num);
            return;
        }

        // 0~9 ������ ��
        for(int j = 0 ; j < 10; j++) {
            // ����� �������� üũ
            if(visited[j]) {
                continue;

            }
            // Character.getNumericValue : char -> int ������ ��ȯ (������ ����)
            // j , arr[idx-1] : ������ ���ڿ� ���� ���ڿ�, ���� �ε�ȣ
            if(idx == 0 || ckeck(Character.getNumericValue(num.charAt(idx - 1)), j , arr[idx-1])) {
                visited[j] = true;
                // true�Ͻ�, num�� ���ڿ� ����
                dfs(num+j, idx+1);
                visited[j] = false;
            }
        }

    }

    static boolean ckeck(int a, int b, String c) {
        // ���� ����ϴ� ���ڿ� j��° ���ڿ� ���Ͽ�, �ε�ȣ�� �����Ǹ� true
        if (c.equals(">")) {
            if(a < b) return false;
        } else if (c.equals("<")){
            if(a > b) return false;
        }
        return true;
    }



}

