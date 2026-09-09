// find the nth term in fibonacci series..
import java.util.*;
class fiboterm {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibN = fibnm1 + fibnm2;
        return fibN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter nth term : ");
        int n = sc.nextInt();
        System.out.println(n+" term is "+fib(n));
    }
}
