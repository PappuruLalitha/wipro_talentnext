import java.util.*;
public class Map4 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int count = 0, N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            graph.get(u).add(v); // For undirected: also add graph.get(v).add(u);
        }
        boolean[] visited = new boolean[N + 1];
        dfs(1, visited);
        System.out.println(count);
    }
    static void dfs(int node, boolean[] visited) {
        if (node == N) {
            count++;
            return;
        }
        visited[node] = true;
        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next, visited);
            }
        }
        visited[node] = false;
    }
}
