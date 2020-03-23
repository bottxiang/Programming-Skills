public class Solution3 {
    /**
     *
     * @param n int整型 第n天
     * @return int整型
     */
    public static int func(int n) {
        int i = 1;
        int k = 0;
        while (k < n) {
            k += i;
            i++;
        }
        if (k >= n) {
            return -1;
        }
        return --i;
    }
    public static int solution (int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2 || n == 3) {
            return 2;
        }
        for (int i = 4; i <= n; i++) {
            if (func(4) == -1);
        }
        if (solution(n-1) == solution(n-2)) {
            if (func(solution(n-2)) != -1) {
                return solution(n-1);
            } else {
                return solution(n-1)+1;
            }
        }
        if(solution(n-1) == solution(n-2) + 1) {
            int x = func(solution(n-1));
            if (x >= 1) {
                return x+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}