import java.util.Scanner;

public class ArrSumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] numArr = new int[size];
        int i = 0;
        while(i<size){
            System.out.println("Enter element no "+ (i+1) +"= ");
            numArr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Sum is = "+Sum(numArr));
        System.out.println("Avg is = "+avg(numArr));
    }
    public static int Sum(int[]numArr) {
        int i = 0;
        int s = 0;
        while(i<numArr.length){
            s = s + numArr[i];
            i++;
        }
        return s;
    }

    public static int avg(int[]numArr) {
        int av = Sum(numArr)/numArr.length;
        return av;
        
    }
}
