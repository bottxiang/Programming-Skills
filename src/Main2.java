import java.util.Scanner;

public class Main2 {
    public static void rotate(int[] matrix, int N) {
        int[] temp = new int[N*N];

        for (int k = 0; k < N*N; k++) {
            int i = k / N;
            int j = k % N;
            int t = N * j + (N-1-i);
            temp[t] = matrix[k];
        }

        for (int k = 0; k < N*N; k++) {
             matrix[k] = temp[k];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] matrix = new int[N*N];
        for (int c = 0; c < N*N; c++) {
            matrix[c] = sc.nextInt();
        }

        int M = sc.nextInt();
        int count = M % 4;

        while (count-- > 0) {
            rotate(matrix, N);
        }

        for (int i = 0; i < N*N; i++) {
            if ((i+1) % N != 0) {
                System.out.print(matrix[i] + " ");
            } else {
                System.out.print(matrix[i] + "\n");
            }
        }
    }
}
