package permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            visited[i] = false;
        }
        dfs(res, new ArrayList<>(), nums, visited);
        return res;
    }
    public void dfs(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] visited) {
        if( list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i-1] && !visited[i-1]) continue; // 剪枝
            list.add(nums[i]);
            visited[i] = true;
            dfs(res, list, nums, visited);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 3};
        System.out.println(solution.permuteUnique(nums));
    }
}
