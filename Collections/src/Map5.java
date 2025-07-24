import java.util.*;
public class Map5 {
    static TreeMap<Integer, TreeMap<Integer, Integer>> graph = new TreeMap<>();
    static List<Integer> bestPath = new ArrayList<>();
    static int maxLandmarks = 0, budget;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of landmarks
        int M = sc.nextInt(); // Number of routes
        budget = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new TreeMap<>());
        }
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt(), v = sc.nextInt(), cost = sc.nextInt();
            graph.get(u).put(v, cost);
            graph.get(v).put(u, cost); // Undirected
        }
        boolean[] visited = new boolean[N + 1];
        dfs(1, 0, visited, new ArrayList<>());
        for (int i : bestPath) System.out.print(i);
        for (int i = bestPath.size() - 2; i >= 0; i--) System.out.print(bestPath.get(i));
    }
    static void dfs(int node, int cost, boolean[] visited, List<Integer> path) {
        visited[node] = true;
        path.add(node);
        if (path.size() > maxLandmarks && 2 * cost <= budget) {
            maxLandmarks = path.size();
            bestPath = new ArrayList<>(path);
        }
        for (Map.Entry<Integer, Integer> entry : graph.get(node).entrySet()) {
            int next = entry.getKey(), edgeCost = entry.getValue();
            if (!visited[next] && 2 * (cost + edgeCost) <= budget) {
                dfs(next, cost + edgeCost, visited, path);
            }
        }
        visited[node] = false;
        path.remove(path.size() - 1);
    }
}
