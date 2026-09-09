package Function;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. to check is prime or not");
        int a = sc.nextInt();
        if(isPrime(a)){
            System.out.println("Prime");
        }else{
            System.out.println("Not");
        }
    }

    public static boolean isPrime(int a) {
        int i = 2;
        while(i<a){
            if(a%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
