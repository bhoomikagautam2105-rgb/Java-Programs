import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int a,b,op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Operation :- \n 1) +\n 2) -\n 3) *\n 4) /");
        System.out.println("Enter your choice :- ");
        op = sc.nextInt();
        switch(op){
            case 1: System.out.println("Enter first and second number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("sum => "+(a+b));
                    break;

            case 2: System.out.println("Enter first and second number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("substraction => "+(a-b));
                    break;
            case 3: System.out.println("Enter first and second number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("multiplication => "+(a*b));
                    break;
            case 4: System.out.println("Enter first and second number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(" divison => "+(a/b));
                    break;                

        }
    }
}
