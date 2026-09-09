import java.util.*; 


class checkTest{
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number : ");
        num = input.sc.nextInt();
        // if(true){
            if(num%2==0){
                System.out.println("Even number");       // Even/odd
            }
            else{
                System.out.println("Odd number");
            }
            int i;
             if(true){                              // Prime
              for(i=2; i<=num/2; i++){
                if(num%i==0){
                    break;
                }
              }
              if(i>num/2){
                System.out.println("Prime no");
              }
            }
            
            if(true){                           // Perfect no
                int sum=0;
                for(i=1; i<=num/2; i++){
                    if(num%i == 0){
                       sum+=i;
                    }
                }
                if(num==sum){
                    System.out.println("Perfect no");
                }
            }
         
            if(true){         // Symmetric no
            int cnt=0;
            int t = num;
            while(t>0){
            cnt++;
            t/=10;
        }
            int d = cnt/2;
            double res = Math.pow(10,d);
            int x ,y;
            x = num/(int)res;
            y = num%(int)res;
           if(x==y){
           System.out.println("symmetric no");
          }

        }
        
        if(true){                    // Palindrome no
            int t = num;
            int d,rev=0;
            while(t>0){
                d = t%10;
                rev = rev*10+d;
                t/=10;
            }
            if(rev == num){
                System.out.println("palindrome no");
             }
        }
         if(true){                  // Armstrong No
            int t,cnt=0;
            double res=0;
             t = num;
            while(t>0){
                cnt++;
                t/=10;
            }
            t = num;
            int d;
            
            while(t>0){
                d = t%10;
                res +=  Math.pow(d,cnt);
                t/=10;
            }
            if(res == num ){
                System.out.println("Armstrong no");
            }
        }
        if(true){                                        // Neon Number
            int sq = num*num;
            int sum = 0;
            while(sq>0){
                int d = sq%10;
                sum+=d;
                sq/=10;
            }
            if(num == sum){
                System.out.println("Neon no   ");
            }

        }
        if(true){
            int t = num;            // niven no
            int sum=0;
            while(t>0){
                sum += t%10;
                t/=10;
            }
            if(num%sum==0){
                System.out.println("Niven no");
            }
        }

        if(true){
            int t = num;
            int sum,prod;
            sum=0;                              // 2 digit special number
            prod = 1;
            while(t>0){
                sum += t%10;
                prod *= t%10;
                t/=10;
            }
            int res = sum+prod;
            if(res == num){
                System.out.println("2 digit special no.");
            }
        }

         if(true){
            int t = num;
            int d,fact,sum=0;
            while(t>0){
                fact = 1;
                d = t%10;
                while(d>1){
                    fact *= d;
                     d--;
                }
                 sum +=fact;
                t/=10;

            }
            if(sum == num){
                System.out.println("krishna Murti no");
            }
        // }

    }
}
}

