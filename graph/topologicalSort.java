import java.util.ArrayList;
import java.util.Stack;
public class topologicalSort {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    // Create a Directed Acyclic Graph (DAG)
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
    }
    // Topological Sort Utility
    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }
    // Topological Sort
    public static void topSort(ArrayList<Edge>[] graph, int V) {
        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, stack);
            }
        }

        System.out.print("Topological Sort Order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    // Main method
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        topSort(graph, V);
    }
}