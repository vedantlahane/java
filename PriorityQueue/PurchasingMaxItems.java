package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PurchasingMaxItems {

    public static int maxItems(ArrayList<Integer> list, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);
        int count = 0;
        while(k>=0 && !pq.isEmpty() && k >= pq.peek()){
            k -= pq.poll();
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer arr[] = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(arr);
        System.out.println(maxItems(list, k));
    }
    
}
