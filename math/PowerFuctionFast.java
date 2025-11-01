public class PowerFuctionFast {
    public static long power(int a, int n){
        if ( n == 0) return 1;
        long temp = power(a, n/2);
        long tempsq = temp * temp;
        if( n % 2 == 1){
            return tempsq * a;
        }
        return tempsq;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
