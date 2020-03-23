import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int m = s1.length();
        int n = s2.length();
        int max = 0;
        Set<String> set = new HashSet<>();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <=n; j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
                else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        set.clear();
                        set.add(s1.substring(i-max,i));
                    }
                    if (dp[i][j] == max) {
                        set.add(s1.substring(i-max,i));
                    }
                }
            }
        }
        for (String s : set) {
            System.out.println(s);
        }

    }
}