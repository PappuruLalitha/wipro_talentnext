import java.util.*;
public class Map2 {
    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        Set<String> lines = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                List<Integer> group = new ArrayList<>(List.of(i, j));
                for (int k = 0; k < N; k++) {
                    if (k != i && k != j && isCollinear(points[i], points[j], points[k])) {
                        group.add(k);
                    }
                }
                if (group.size() >= 3) {
                    Collections.sort(group);
                    StringBuilder key = new StringBuilder();
                    for (int idx : group) key.append(idx).append(",");
                    lines.add(key.toString());
                }
            }
        }
        System.out.println(lines.size());
    }
    static boolean isCollinear(Point a, Point b, Point c) {
        return (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) == 0;
    }
}
