package Graph;
import java.util.*;

public class AdjacencyListRepresentationWithClassNodes {
    public static class Node {
        String name;
        LinkedList<Node> adjList;
        
        public Node(String name) {
            this.name = name;
            this.adjList = new LinkedList<>();
        }    

        public void addEdge(Node node) {
            adjList.add(node);
        }

        public void display() {
            System.out.print(name + " -> ");
            for (Node n : adjList) {
                System.out.print(n.name + " ");
            }
            System.out.println();
        }
    }
    
    // Graph data structure to manage nodes
    private static HashMap<String, Node> graph = new HashMap<>();
    
    public static void addNode(String name) {
        if (!graph.containsKey(name)) {
            Node newNode = new Node(name);
            graph.put(name, newNode);
            System.out.println("Node '" + name + "' added successfully.");
        } else {
            System.out.println("Node '" + name + "' already exists.");
        }
    }
    
    public static void addEdge(String node1Name, String node2Name) {
        Node node1 = graph.get(node1Name);
        Node node2 = graph.get(node2Name);
        
        if (node1 == null) {
            System.out.println("Node '" + node1Name + "' does not exist. Please add it first.");
            return;
        }
        if (node2 == null) {
            System.out.println("Node '" + node2Name + "' does not exist. Please add it first.");
            return;
        }
        
        node1.addEdge(node2);
        // For undirected graph, add both directions
        node2.addEdge(node1);
        System.out.println("Edge added between '" + node1Name + "' and '" + node2Name + "'.");
    }
    
    public static void displayGraph() {
        if (graph.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        
        System.out.println("Graph representation:");
        for (Node node : graph.values()) {
            node.display();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. Add Node");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch(choice) {
                case 1:
                    System.out.print("Enter the name of the node to add: ");
                    String nodeName = sc.nextLine();
                    addNode(nodeName);
                    break;
                case 2:
                    System.out.print("Enter the names of the nodes to connect (format: node1 node2): ");
                    String[] nodes = sc.nextLine().split(" ");
                    if (nodes.length == 2) {
                        addEdge(nodes[0], nodes[1]);
                    } else {
                        System.out.println("Invalid input. Please enter exactly two node names.");
                    }
                    break;
                case 3:
                    displayGraph();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
        }
    }   
}
