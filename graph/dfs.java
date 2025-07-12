import java.util.ArrayList;

public class dfs {
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
            graph[i] = new ArrayList<Edge>();
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

    // DFS function
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        // Base case: already visited
        if (vis[curr]) return;

        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, vis);
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        boolean[] vis = new boolean[v];

        dfs(graph, 0, vis);

        //for component 
        for(int i=0;i<v;i++){
            if(vis[i]==false){
                dfs(graph, i, vis);
            }
        }
        System.out.println();
    }
}
