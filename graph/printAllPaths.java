import java.util.ArrayList;
public class printAllPaths{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
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
    public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar){
        if(curr==tar){
            System.out.print(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                printAllPath(graph, vis, e.dest, path+e.dest, tar);
                vis[curr]=false;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

int src=0,tar=3;
printAllPath(graph, new boolean[v], src, "0", tar);
    }
}