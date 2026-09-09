//print number from 1 to n...
import java.util.*;
class oneToN{
    public static void printCounting(int i,int n){
        if(i==n+1){
            return;
        }
        System.out.println(i);
        printCounting(i+1,n);
    }
    public static void main(String[] args) {
        printCounting(1,10);
    }
}


   