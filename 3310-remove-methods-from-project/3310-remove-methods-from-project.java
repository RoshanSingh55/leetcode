class Solution {
    public void func(int u, List<List<Integer>> adj, boolean[] vis) {
        vis[u] = true;

        for (int v : adj.get(u)) {
            if (vis[v]) continue;
            func(v, adj, vis);
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] it : invocations) {
            int u = it[0];
            int v = it[1];
            adj.get(u).add(v);
        }

        boolean[] vis = new boolean[n];
        func(k, adj, vis);

        for (int[] it : invocations) {
            int u = it[0];
            int v = it[1];

            if (vis[u]) continue;

            if (vis[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}