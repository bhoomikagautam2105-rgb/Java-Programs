package Function;

public class Star {
    public static void main(String[] args) {
        starPrint();
    }

    public static void starPrint() {
        int row = 0;
        while(row<6){
            System.out.print("*");
            for(int i=0;i<row;i++){
                System.out.print(" *");
            }
            row++;
            System.out.println();
        }
        
    }
}