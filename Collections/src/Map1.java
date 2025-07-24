import java.util.*;
public class Map1 {
    static class Edge {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    static List<List<Edge>> graph = new ArrayList<>();
    static List<Integer> bestPath = new ArrayList<>();
    static int maxLandmarks = 0, budget;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        budget = sc.nextInt();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt(), v = sc.nextInt(), cost = sc.nextInt();
            graph.get(u).add(new Edge(v, cost));
            graph.get(v).add(new Edge(u, cost));
        }
        boolean[] visited = new boolean[N + 1];
        List<Integer> currentPath = new ArrayList<>();
        dfs(1, 0, visited, currentPath);
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
        for (Edge e : graph.get(node)) {
            if (!visited[e.to] && 2 * (cost + e.cost) <= budget) {
                dfs(e.to, cost + e.cost, visited, path);
            }
        }
        visited[node] = false;
        path.remove(path.size() - 1);
    }
}
