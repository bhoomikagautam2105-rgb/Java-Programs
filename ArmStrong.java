import java.util.*;
public class ArmStrong {
   public static void main(String[] args) {
    int n,cnt=0;
    double res=0;
    System.out.println("enter number : ");
    n = input.sc.nextInt();
    int t = n;
    while(t>0){
        cnt++;
        t/=10;
    }
    t = n;
    int d;
    
    while(t>0){
        d = t%10;
        res +=  Math.pow(d,cnt);
        t/=10;
    }
    if(res == n ){
        System.out.println("Armstrong number");
    }
    else{
        System.out.println("not Armstrong ");
    }
   } 
}
