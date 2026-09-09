 import java.util.*;
 class Challenge {
    public static void main(String[] args) {
        // create a program to find the minimun of two numbers

        Scanner sc = new Scanner(System.in);
       /* System.out.print("Enter any two No : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a<b?a:b;
        System.out.println("Minimum Number is "+res); */


        // Create a program to find the gicen number is even or odd..

       /*  System.out.println("Enter number : ");
        int num = sc.nextInt();
        String res = num%2==0 ? "even" : "Odd";
        System.out.println(res);

        */

        // Create a absoulte value for any integer..

       /*  System.out.println("Enter any Number ");
        int num = sc.nextInt();
        int result = num>=0 ? num : -num;
        System.out.println("absolute value is "+result);
    */
    // Create a program to based on a student's score

    /*System.out.println("\n Enter Score of Student: ");
    int score = sc.nextInt();
    String res = score>80 ? "High" : score>=50 && score<=80 ? "Moderate" : "Low";
    System.out.println("Your Score is "+res);
        */
       
     // Create a program to print the month of the year based on a number..
     
    /* System.out.println("Enter any Month Number (1-12) : ");
     int day = sc.nextInt();
     String month = switch(day){
             case 1 -> "January";
             case 2 -> "February";
             case 3 -> "March";
             case 4 -> "April";
             case 5 -> "May";
             case 6 -> "June";
             case 7 -> "july";
             case 8 -> "august";
             case 9 -> "september";
             case 10 -> "october";
             case 11 -> "november";
             case 12 -> "December";
             default -> "Invalid";
     };
     System.out.println(month); */

     int [] arr = new int[] {
        10,20,30,40,50
     };

     for(int val : arr){
        System.out.println(val);
     }
    } 

}
