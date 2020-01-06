package pyramidOfStars;

import java.util.Scanner;

public class PyramidOfStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want in your pyramid?");
        int n = scanner.nextInt();
        int colums = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= colums; j++) {
                if (j >= n-(i-1) && j <= n+(i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
