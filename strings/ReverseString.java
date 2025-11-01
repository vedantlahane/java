public class ReverseString {
    public static void main(String args[]){
        String str = "Hello World";
        char[] arr = str.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(arr);
    }
}
