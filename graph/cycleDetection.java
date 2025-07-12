import java.util.ArrayList;
public class cycleDetection {
    // Edge class
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create a graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    // Cycle detection for directed graph
    public static boolean isCycle(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;

        for (Edge e : graph[curr]) {
            if (rec[e.dest]) {
                return true; // cycle detected
            } else if (!vis[e.dest]) {
                if (isCycle(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        boolean[] vis = new boolean[v];
        boolean[] rec = new boolean[v];

        boolean hasCycle = false;

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (isCycle(graph, vis, i, rec)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        if (hasCycle) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle in the graph.");
        }
    }
}
