import java.util.ArrayList;

public class cycleForUndirectedGraph {

    // Edge class
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create undirected graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (undirected = add both directions)
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        // Uncomment below for an acyclic graph
        // graph[3].add(new Edge(3, 4));
        // graph[4].add(new Edge(4, 3));
    }

    // DFS for cycle detection
    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (vis[e.dest] && e.dest != par) {
                return true; // Cycle found
            } else if (!vis[e.dest]) {
                if (isCycleUndirected(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] vis = new boolean[V];
        boolean cycle = false;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (isCycleUndirected(graph, vis, i, -1)) {
                    cycle = true;
                    break;
                }
            }
        }

        if (cycle) {
            System.out.println("Cycle detected in the undirected graph.");
        } else {
            System.out.println("No cycle in the undirected graph.");
        }
    }
}
