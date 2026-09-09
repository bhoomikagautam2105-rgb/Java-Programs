import java.util.*;
public class Divisor {
    public static int findGCD(int a ,int b){
        int least = Least(a,b);
        int gcd = 1;
        for(int i=2; i<=least; i++){
            if(a%i==0 && b%i==0){
                 gcd = i;
            }
        }
        return gcd;
    }
    public static int Least(int a , int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(" enter two number to check greatest common divisor : ");
        int num1 = input.sc.nextInt();
        int num2 = input.sc.nextInt();
        int res = findGCD(num1, num2);
        System.out.println("greatest divisor is "+res);
    }
}
