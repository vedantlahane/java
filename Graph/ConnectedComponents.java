//Intituition :- We will use DFS to find the connected components in the graph. We will start from a node and visit all the nodes connected to it. We will mark all the nodes visited in the process. We will repeat the process for all the nodes in the graph. The number of times we have to repeat the process is the number of connected components in the graph.
//Time Complexity :- O(N + E) where N is the number of nodes and E is the number of edges in the graph.
//Space Complexity :- O(N + E) where N is the number of nodes and E is the number of edges in the graph.



package Graph;
import java.util.Scanner;
import java.util.LinkedList;

public class ConnectedComponents {

    public static void dfs(int u, LinkedList<LinkedList<Integer>> adj, boolean visited[]){
        visited[u] = true;
        for(int v : adj.get(u)){//Iterating through all the nodes connected to the current node.
            if(!visited[v]){//If the node is not visited, then we will call the dfs function on it.
                dfs(v, adj, visited);//Calling the dfs function on the connected node. that means we are visiting the connected node. In the process we will mark all the nodes connected to it as visited. 
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//Number of nodes
        int E = sc.nextInt();//Number of edges
        LinkedList<LinkedList<Integer>> adj = new LinkedList<>();//Adjacency list - it is a list of lists, where each list represents the nodes connected to a node.
        for(int i = 0; i < N; i++){
            adj.add(new LinkedList<>());//initializing the adjacency list.
        }
        for(int i = 0; i < E; i++){//Adding edges to the graph.
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visited[] = new boolean[N];//Visited array to keep track of visited nodes.
        int count = 0;//Count of connected components. 
        for(int i = 0; i < N; i++){//Iterating through all the nodes.
            if(!visited[i]){//if the node is not visited, then we will call the dfs function on it.
                count++;//Incrementing the count of connected components.
                dfs(i, adj, visited);
            }
        }
        System.out.println(count);
        sc.close();
    }    
}
