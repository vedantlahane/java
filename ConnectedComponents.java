import java.util.Scanner;
import java.util.ArrayList;
public class ConnectedComponents {
    public static void dfs(ArrayList<ArrayList<Integer>>  graph, int src, boolean vis[]){
        vis[src] = true;
        for(int i = 0; i < graph.get(src).size(); i++){
            int child = graph.get(src).get(i);
            if(!vis[child]){
                dfs(graph, child, vis);
            }
        }

    }

    public static void main(String args[]){
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i < m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean vis[] = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                dfs(graph, i, vis);
                count++;
            }
        }
        System.out.println(count);
        sc.close();


    }
}
