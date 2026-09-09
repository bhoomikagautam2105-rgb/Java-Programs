public class EvenOddBitwise {
    public static void main(String[] args) {
        System.out.println("Enter number to check even or odd");
        int num = input.sc.nextInt();
        int res = num & 1;
        if(res==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd ");
        }
    }
}
