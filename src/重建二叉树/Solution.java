package 重建二叉树;

public class Solution {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static TreeNode ConstructCore(int[] pre, int preStart, int preEnd,
                                         int[] in, int inStart, int inEnd) {
        int rootValue = pre[preStart];
        TreeNode root = new TreeNode(rootValue);
        if (preStart == preEnd && inStart == inEnd && rootValue == in[inStart]) {
            return root;
        }
        int inRoot = inStart;
        while (inRoot <= inEnd && in[inRoot] != rootValue) {
            inRoot++;
        }
        int leftLength = inRoot - inStart;
        int rightLength = inEnd - inRoot;
        if (leftLength > 0) {
            root.left = ConstructCore(pre, preStart+1, preStart+leftLength,
                    in, inStart, inRoot-1);
        }
        if (rightLength > 0) {
            root.right = ConstructCore(pre, preStart+leftLength+1, preEnd,
                    in, inRoot+1, inEnd);
        }
        return root;
    }

    public static void print(TreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = ConstructCore(pre, 0, pre.length-1, in, 0, in.length-1);
        print(root);
    }
}
