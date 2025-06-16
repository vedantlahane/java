package Heap;

public class MaxHeap {
    int heap[];
    int size;
 
    public MaxHeap(int capacity){
        heap = new int[capacity];
        size = 0;
    }

    void insert(int val){
        heap[size] = val;
        int i = size;
        while( i > 0 && heap[i] > heap[(i-1)/2]){
            int temp = heap[i];
            heap[i] = heap[(i-1)/2];
            heap[(i-1)/2] = temp;
            i = (i-1)/2;
        }
    }

    
}
