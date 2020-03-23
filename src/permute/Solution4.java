package permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
    public int[][] permutation(int[] arr) {
        int len = arr.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            visited[i] = false;
        }
        dfs(res, new ArrayList<>(), arr, visited);
        int[][] a = new int[res.size()][len];
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < len; j++) {
                a[i][j] = res.get(i).get(j);
            }
        }
        return a;
    }
    public void dfs(List<List<Integer>> res, List<Integer> list, int[] arr, boolean[] visited) {
        if( list.size() == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if (visited[i]) continue;
            list.add(arr[i]);
            visited[i] = true;
            dfs(res, list, arr, visited);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }

}