import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num : " );
        a= sc.nextInt();
        System.out.println("Enter 2nd num : ");
        b= sc.nextInt();
        sum = a+b;
        System.out.println("Sum = "+sum);
    }
}



