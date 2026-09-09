import java.util.*;
 class power1 {
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        } 
        if(a==0){
            return 0;
        }

        if(n%2==0){
            return pow(a,n/2)*pow(a,n/2);
        }
        else{
            return pow(a,n/2)*pow(a,n/2)*a;
        }
    }
    public static void main(String[] args) {
        int a = 2,n=5;
        System.out.println("power = "+pow(a, n));
    }
 }

    

