public class Butterfly {
    public static void main(String[] args) {
       // first part 
       for(int i=1; i<=4; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        // spaces 
        for(int j=1; j<=2*(4-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

        // second part

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
           
        System.out.println();
    }
    }
       }
    

