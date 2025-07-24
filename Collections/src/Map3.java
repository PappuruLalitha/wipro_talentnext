import java.util.*;
public class Map3 {
    static int[][] graph;
    static boolean[] visited;
    static int minCost = Integer.MAX_VALUE, N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new int[N][N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                graph[i][j] = sc.nextInt();
        visited[0] = true;
        tsp(0, 1, 0);
        System.out.println(minCost);
    }
    static void tsp(int pos, int count, int cost) {
        if (count == N) {
            minCost = Math.min(minCost, cost + graph[pos][0]);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i] && graph[pos][i] != 0) {
                visited[i] = true;
                tsp(i, count + 1, cost + graph[pos][i]);
                visited[i] = false;
            }
        }
    }
}
