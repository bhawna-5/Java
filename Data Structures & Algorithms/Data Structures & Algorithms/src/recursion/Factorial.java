package recursion;

public class Factorial {
    public static void print(int n , int fact){
        if(n==1){
            fact*=n;
            System.out.println(fact);
            return;
        }
        fact*=n;
        print(n-1,fact);
    }
    public static void main(String[] args) {
        print(6,1);
    }
}
