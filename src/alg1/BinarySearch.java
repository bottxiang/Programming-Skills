package alg1;

public class BinarySearch {
    /* 二分查找递归实现 */
    public static int binSearch(int[] arr, int low, int high, int key) {

        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < key) {
                return binSearch(arr, mid+1, high, key);
            } else if (arr[mid] > key) {
                return binSearch(arr, low, mid-1, key);
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }
    /* 二分查找循环实现 */
    public static int binSearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            System.out.println("[" + "arr[" + low + "]=" + arr[low]+ "," + "arr[" + high + "]=" + arr[high] +"]");
            int mid = low + (high - low) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

}
