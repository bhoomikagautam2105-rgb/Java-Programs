package Function;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your no. : ");
        int num=sc.nextInt();
        int out = sum(num);
        System.out.println("Output is = "+ out);
    }
    public static int sum(int num) {
        int i =1;
        int s = 0;
        while(i<=num){
        s += i;
        i += 2;
        }
        return s;
    }
}
