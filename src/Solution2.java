public class Solution2 {
    //暴力
    public static int stock(int[] price) {
        int n = price.length;
        int maxRevenue = Integer.MIN_VALUE;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int revenue = price[j] - price[i];
                if (revenue > maxRevenue) {
                    maxRevenue = revenue;
                }
            }
        }
        return maxRevenue;
    }
    // O(n)
    public static int stock2(int[] price) {
        int minPrice = price[0];
        int maxRevenue = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            } else {
                int revenue = price[i] - minPrice;
                if (revenue > maxRevenue) {
                    maxRevenue = revenue;
                }
            }
        }
        return maxRevenue;
    }
    public static void main(String[] args) {
        int[] pr = {4, 5, 9, 2, 5, 4, 8};
        System.out.println(stock2(pr));
    }
}