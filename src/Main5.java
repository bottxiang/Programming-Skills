import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int res = 0;

        int res1 = 0;
        int res2 = 0;
        res1 = (n / 2) * (m / 2);
        int r1 = n % 2;
        int r2 = m % 2;
        if (r1 == 0 && r2 != 0) {
            res2 = n / 2;
        } else if (r2 == 0 && r1 != 0) {
            res2 = m / 2;
        } else if (r1 == 0 && r2 == 0) {
            res2 = 0;
        } else {
            res2 = (n + m - 2) / 2 + 1;
        }
        res = res1 + res2;
        System.out.println(res);
    }
}