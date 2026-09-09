// find the occurrences of number in array...
import java.util.*;
class ArrOccur {
    public static void inputArray(int[] arr){
         Scanner scan = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){                     // taking input
            System.out.print("Enter Element : ");
            arr[i] = scan.nextInt();
            System.out.println();

        }
    }
    public static void printArray(int[] arr){
        System.out.println("Array's Element...");
        for(int i=0; i<arr.length; i++){                // display
            System.out.print(arr[i]+" ");
        }

    }
    public static int findOccur(int[] arr,int num){
         int count = 0;                                  
         for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
         }
         return count;    
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];                    
        inputArray(arr);
        printArray(arr);
        System.out.print("\nEnter Number : ");
        int num = sc.nextInt();
        int count = findOccur(arr, num);
        System.out.println("Occurrences of "+num+" is "+count);
    }
}
