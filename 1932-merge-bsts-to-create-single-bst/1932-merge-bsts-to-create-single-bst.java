class Solution {

    public TreeNode canMerge(List<TreeNode> trees) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (TreeNode t : trees) {
            map.put(t.val, t);
            if (t.left != null)
                count.put(t.left.val, count.getOrDefault(t.left.val, 0) + 1);
            if (t.right != null)
                count.put(t.right.val, count.getOrDefault(t.right.val, 0) + 1);
        }

        TreeNode root = null;
        for (TreeNode t : trees) {
            if (!count.containsKey(t.val)) {
                if (root != null) return null; // more than one possible root
                root = t;
            }
        }

        if (root == null) return null;

        if (!build(root, map, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return null;

        if (map.size() > 1)
            return null;

        return root;
    }

    private boolean build(TreeNode root, Map<Integer, TreeNode> map, int min, int max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max)
            return false;

        if (map.containsKey(root.val) && map.get(root.val) != root) {
            TreeNode t = map.get(root.val);
            root.left = t.left;
            root.right = t.right;
            map.remove(root.val);
        }

        return build(root.left, map, min, root.val)
                && build(root.right, map, root.val, max);
    }
}
