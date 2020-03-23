import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void dfs(int idx, int n, int k, int c, String s, List<String> res) {
        if (idx == c) {
            res.add(s);
            return;
        }
        if (n > 0) dfs(idx+1, n-1, k, c, s+"*", res);
        if (k > 0) dfs(idx+1, n, k-1, c, s+"|", res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<String> res = new ArrayList<>();
        dfs(0, n, k-1, n+k-1, "", res);
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
