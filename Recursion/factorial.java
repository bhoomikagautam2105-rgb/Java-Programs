import java.util.*;
class factorial {
    public static int FindFact(int n){
        if(n==0){
            return 1;
        }
        int facNm1 = FindFact(n-1);
        int res = facNm1*n;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number : ");
        n = sc.nextInt();
        int res = FindFact(n);
        System.out.println("factorial = "+res);
    }
}
