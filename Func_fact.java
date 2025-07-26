import java.util.*;
public class Func_fact {
    public static long factorial(int n){
        int fact =1;
        for(int i =1;i<=n;i++){
             fact = fact*i;
        }
        return fact;
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    
}

