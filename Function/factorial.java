package Function;

import java.util.Scanner;

public class factorial {
    // public static int findFactorial(int n){
    //     int fact = 1;
    //     for(int i=n; i>=2; i--){
    //         fact = fact*i;
    //     }
    //     return fact;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n;
    //     System.out.println("enter number : ");
    //     n = sc.nextInt();
    //     int res = findFactorial(n);
    //     System.out.println("factorial of given is "+res);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no. : ");
        int n = sc.nextInt();
        System.out.println("Factorial of no. is "+findFactorial(n));
    }

    public static long findFactorial(int n) {
        if (n<2){
             return 1;
        }
        int i = 2;
        long fact = 1;
        while (i<=n){
            fact *= i;
            i++;
        }
        return fact;
    }
}

  
