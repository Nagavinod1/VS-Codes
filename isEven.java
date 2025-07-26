import java.util.*;
public class isEven{
    public static boolean isEvenO(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isEvenO(n)){
            System.out.println("YES it is EVEN");

        }
        else{
            System.out.println("No it is not Even");
        }
    }
}