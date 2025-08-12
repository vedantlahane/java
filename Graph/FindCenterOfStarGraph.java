package Graph;
import java.util.Scanner;
import java.util.*;
public class FindCenterOfStarGraph {
    public class Graph {
        private int v;
        private LinkedList<Integer>[] adjList;

        public Graph(int v){
            this.v = v;
            adjList = new LinkedList[v];
            for(int i = 0  ; i < v;i++) adjList[i] = new LinkedList<>();
        }

        public void addEdge(int src, int dest){
            adjList[src].add(dest);
            adjList[dest].add(src); // For undirected graph
        }
        
        public void findCenter() {
            int center = -1;
            for (int i = 0; i < v; i++) {
                if (adjList[i].size() == v - 1) { // A center node in a star graph is connected to all other nodes
                    center = i;
                    break;
                }
            }
            if (center != -1) {
                System.out.println("The center of the star graph is: " + center);
            } else {
                System.out.println("No center found in the graph.");
            }
        }
        
    }   
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        Graph graph = new FindCenterOfStarGraph().new Graph(v);
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        System.out.println("Enter edges (src dest):");
        for(int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }
        // Find the center of the star graph
        graph.findCenter();
        sc.close();
    } 
}
