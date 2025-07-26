public class Pattern{
    public static void main(String args[]){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){ //j<=i for line = star printing
                System.out.print("*");
            }
            System.out.println();
        }
    }
}