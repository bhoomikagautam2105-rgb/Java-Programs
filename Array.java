import java.util.*;
public class Array {
    // linear search
    public static int linearSearch(int arr[],int key){
       for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
       }
       return -1;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,12,14,16};
        print(arr);
        int index = linearSearch(arr, 14);
        if(index!=-1){
            System.out.println("Key present at index "+index);
        }
        else{
            System.out.println("key is not present in array");
        }
        
        
    }
}
