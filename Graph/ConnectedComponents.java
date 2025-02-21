package Graph;
import java.util.Scanner;
import java.util.LinkedList;

public class ConnectedComponents {

    public static void dfs(int u, LinkedList<LinkedList<Integer>> adj, boolean visited[]){
        visited[u] = true;
        for(int v : adj.get(u)){
            if(!visited[v]){
                dfs(v, adj, visited);
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        LinkedList<LinkedList<Integer>> adj = new LinkedList<>();
        for(int i = 0; i < N; i++){
            adj.add(new LinkedList<>());
        }
        for(int i = 0; i < E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visited[] = new boolean[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            if(!visited[i]){
                count++;
                dfs(i, adj, visited);
            }
        }
        System.out.println(count);
        sc.close();
    }    
}
