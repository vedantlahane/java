package Graph;

import java.util.*;
public class MaximumNetworkRank {

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
    
}
