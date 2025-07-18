import java.util.ArrayList;

public class bridge {
    static int time = 0; // global time counter

    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis,
                           int[] dt, int[] low, int parent) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (Edge e : graph[curr]) {
            if (e.dest == parent) {
                continue; // skip the parent
            }

            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, dt, low, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);

                // Bridge condition
                if (dt[curr] < low[e.dest]) {
                    System.out.println("Bridge: " + curr + " --- " + e.dest);
                }
            } else {
                // Back edge
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    public static void getBridge(ArrayList<Edge>[] graph, int V) {
        boolean[] vis = new boolean[V];
        int[] dt = new int[V];  // discovery time
        int[] low = new int[V]; // lowest reachable discovery time

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dt, low, -1);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        getBridge(graph, V);
    }
}