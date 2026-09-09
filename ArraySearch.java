import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = {12,45,6,8,9,34};
        System.out.println("Enter no to find in arr : ");
        int a = sc.nextInt();

        if(isFound(myArr, a)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }

    public static boolean isFound(int arr[], int a) {
        int i = 0;
        while(i<arr.length){
            if(arr[i] == a){
                return true;
            }
            i++;
        }
        return false;    
    }
}
