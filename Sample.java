public class Sample {
    public static void Buttery(int n ){
        for(int i =1;i<=n-i;i++){
            //stars
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(" *");

            }
            System.out.println();
        }
        for(int i =n;i<=1;i--){
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(" *");

            }
            System.out.println();
        }   
       

        }
        public static void main(String args[]){
            Buttery(4);
    } 
}
