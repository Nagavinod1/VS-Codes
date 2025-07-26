import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n==2){
            System.out.println("Prime number");
        }
        else{
            for(int i =2;i<=n-1;i++){
                if(n%i==0){
                    System.out.println("not prime");
                break;
                }
                else{
                    System.out.println("prime number");
                    break;
                }
            }
        }
    }
}
