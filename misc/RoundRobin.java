import java.util.ArrayList;
import java.util.List;
import java.util.Stack; 
import java.util.*;


public class RoundRobin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of processes
        int[] processes = new int[n];
        int[] burstTimes = new int[n];
        int[] waitingTimes = new int[n];
        int[] turnaroundTimes = new int[n];
        int quantum = sc.nextInt(); // Time quantum for Round Robin scheduling
        System.out.println("Enter the process IDs:");
        for(int i = 0; i < n; i++) {
            processes[i] = sc.nextInt();
        }
        System.out.println("Enter the burst times for each process:");
        for(int i = 0; i < n; i++) {
            burstTimes[i] = sc.nextInt();
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            queue.add(i); // Add process indices to the queue
        
    }
}
