import java.util.*;
class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char ch;
        int posCnt,negCnt,zeroCnt;
        posCnt = negCnt = zeroCnt =0;
        do{
            System.out.println("Enter number : ");
            int a = sc.nextInt();
            if(a>0){
                posCnt++;
            }
            else if(a<0){
                negCnt++;
            }
            else if(a==0){
                zeroCnt++;
            }
            System.out.print("Do you want to continue (y/n) :  ");
            ch = sc.next().charAt(0);

        }while(ch!='n');
        System.out.println("Total Positive No = "+posCnt);
        System.out.println("Total Negative No = "+negCnt);
        System.out.println("Total zeros  = "+zeroCnt);
    }
}
