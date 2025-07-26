public class Pprime{
    public static boolean Isprime(int n){
        if (n==2){
            return true;
        }
        else{
            for(int i =2;i<=n-1;i++){
                if(n%i ==0){
                    return false;
                }
                
            }
            return true;
        }
    }
    public static void main(String args[]){
        int n =100;
        for(int i =2;i<=n-1;i++){
            if(Isprime(i))
            System.out.print(i+" ");
        }
       
}
}
