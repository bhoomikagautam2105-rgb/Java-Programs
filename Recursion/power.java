import java.util.*;
class power {
    public static int calcPow(int a,int n){
        if(n==0){
            return 1;
        } 
        if(a==0){
            return 0;
        }

        int xpowNm1 = calcPow(a, n-1);
        int xpowN = xpowNm1*a;
        return xpowN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int a = sc.nextInt();
        System.out.println("Enter exponent : ");
        int n = sc.nextInt();
        System.out.println("Power = "+calcPow(a, n));

        
    }
}
