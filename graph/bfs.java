import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs{
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s,int d ,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,-1));
        graph[3].add(new Edge(3, 2,0));

   }

    public static void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
            }

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
    public static void bfsComponent(ArrayList<Edge> graph[], int V, boolean vis[], int start) {
    Queue<Integer> q = new LinkedList<>();
    q.add(start);

    while (!q.isEmpty()) {
        int curr = q.remove();
        if (vis[curr] == false) {
            System.out.print(curr + " ");
            vis[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
}
    public static void main(String[] args) {
       int V=4;
       
        ArrayList<Edge> graph[] =new ArrayList[V];
        createGraph(graph);
        bfs(graph, V);

        //compoenent ques k liye
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                bfsComponent(graph, V, vis, i);
            }
        }
        System.out.println();
   }
}