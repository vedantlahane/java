package Graph;
import java.util.*;

public class AdjacencyListRepresentation {
    public class Graph{
        private int v;
        private LinkedList<Integer>[] adjList;
        public Graph(int v){
            this.v = v;
            adjList = new LinkedList[v];
            for(int i = 0 ; i < v ;i++) adjList[i] = new LinkedList<>();
        }

        public void addEdge(int src, int dist){
            adjList[src].add(dist);
            adjList[dist].add(src); // For undirected graph
        }

        public void pritGraph(){
            for(int i = 0 ;i < v ;i++){
                System.out.print("Vertex " + i + ": ");
                for(int j : adjList[i])System.out.print(" -> " + j);
                System.out.println();
            }
        }

        public void removeEdge(int src, int dist){
            adjList[src].remove(Integer.valueOf(dist));
            adjList[dist].remove(Integer.valueOf(src)); // For undirected graph
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of vertices: ");
            int v = sc.nextInt();
            Graph graph = new AdjacencyListRepresentation().new Graph(v);
            System.out.print("Enter number of edges: ");
            int e = sc.nextInt();
            System.out.println("Enter edges (src dest):");
            for(int i = 0; i < e; i++) {
                int src = sc.nextInt();
                int dest = sc.nextInt();
                graph.addEdge(src, dest);
            }
            graph.pritGraph();
            sc.close();
        }

    }
}
