public class IfElse {
    public static void rec(boolean flag) {
        if (flag) {
            System.out.println("s1");

            rec(false);
        } else {
            System.out.println("s2");
        }
    }
    public static void main(String args[]){
        rec(true);
    }
}
