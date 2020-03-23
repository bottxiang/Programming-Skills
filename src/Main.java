import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.next();
        String s2 = in.next();

        char[] a = new StringBuilder(s1).reverse().toString().toCharArray();
        char[] b = new StringBuilder(s2).reverse().toString().toCharArray();

        int lenA = a.length;
        int lenB = b.length;
        int maxLen = lenA > lenB ? lenA:lenB;
        int[] sum = new int[maxLen+1];
        for (int i = 0; i <= maxLen; i++) {
            sum[i] = (i<lenA? a[i]-'0':0) + (i<lenB? b[i]-'0':0);
        }
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] >= 10) {
                sum[i+1] += sum[i] / 10;
                sum[i] = sum[i] % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (sum[maxLen] != 0) sb.append(sum[maxLen]);
        for(int i = maxLen-1; i >= 0; i--) {
            sb.append(sum[i]);
        }
        System.out.println(sb.toString());

    }
}