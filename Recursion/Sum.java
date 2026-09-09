// sum of N natural numbers..
import java.util.*;
class Sum{
    public static int FindSum(int n){
        if(n==1){
            return 1;
        }
        int SumNm1 = FindSum(n-1);
        int res = SumNm1 + n;
        return res;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to sum of n natural no. Calculator : ");
    int n = sc.nextInt();
    int res = FindSum(n);
    System.out.println("Sum = "+res);

   } 
}
