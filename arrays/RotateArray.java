import java.util.Scanner;
public  class RotateArray{
    public static int[] rotatedArray(int[] arr, int k){
        int n = arr.length;
        int[] rotatedArr = new int[n];
        for(int i = 0; i < n; i++){
            rotatedArr[(i+k)%n] = arr[i];
        }
        return rotatedArr;
    }

    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int[] rotatedArr = rotatedArray(arr, k);
        System.out.println("The rotated array is:");
        for(int i = 0; i < n; i++){
            System.out.print(rotatedArr[i] + " ");
        }
        sc.close();
    }

}