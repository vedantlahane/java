package Graph;
import java.util.*;
public class TopologicalSorting {

    public static int[] indegree;
    
    public class Node {
        int id;
        LinkedList<Node> adjList;
        
        public Node(int id) {
            this.id = id;
            this.adjList = new LinkedList<>();
        }
        
        public void addEdge(Node node) {
            adjList.add(node);
        }
        
        public void display() {
            System.out.print(id + " -> ");
            for (Node n : adjList) {
                System.out.print(n.id + " ");
            }
            System.out.println();
        }
        
    }

    public int[] topologicalSort(Node[] nodes) {
        int n = nodes.length;
        indegree = new int[n];
        
        // Calculate indegrees
        for (Node node : nodes) {
            for (Node neighbor : node.adjList) {
                indegree[neighbor.id]++;
            }
        }
        
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(nodes[i]);
            }
        }
        
        List<Integer> sortedOrder = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            sortedOrder.add(current.id);
            
            for (Node neighbor : current.adjList) {
                indegree[neighbor.id]--;
                if (indegree[neighbor.id] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        
        if (sortedOrder.size() != n) {
            throw new IllegalStateException("Graph has a cycle, topological sort not possible.");
        }
        
        return sortedOrder.stream().mapToInt(i -> i).toArray();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        TopologicalSorting graph = new TopologicalSorting();
        
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = graph.new Node(i);
        }
        
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        System.out.println("Enter edges (src dest):");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            nodes[src].addEdge(nodes[dest]);
        }
        
        // Display the graph
        for (Node node : nodes) {
            node.display();
        }
        
        sc.close();
    }
}
