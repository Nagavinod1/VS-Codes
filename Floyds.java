
public class Floyds {
    public static void Pattern(int n){
       int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++ +" ");
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Pattern(5);
    }
    
}
