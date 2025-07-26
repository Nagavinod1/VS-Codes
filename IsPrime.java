import java.util.*;
public class IsPrime {

    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        Boolean Prime = true;
        System.out.print("ENter the number :");
        int n = s.nextInt();
        if(n==2)
        System.out.print("prime");
        else{
            for(int i =2;i<=n-1;i++){
                if(n%i==0)
                    Prime = false;


            }
            if(Prime = true)
            System.out.print("Prime");
            else{
                System.out.print("not prime");
            }
        }


    }
    
}
