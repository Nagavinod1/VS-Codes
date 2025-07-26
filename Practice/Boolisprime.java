import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,count=0;
        N=sc.nextInt();
        while(N>0){
            int rem=N%2;
            count+=rem;
           N = N/2;
        }
        int n;
       n=count;
      
        if(n==2)
        System.out.println("n is prime");
        else{
            boolean isPrime = true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0)
                isPrime=false;
            }
            if(isPrime == true){
            System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");
                }
    
        }

        }

        
    }

