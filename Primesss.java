public class Primesss {
    public static int Prime100(int n){
        if(n==2){
            System.out.println(n);
        }
        for(int i =2;i<n;i++){
            if(n%i==0){
                break;
            }
           
        } 
        return n;
        }
    }
    public static void main(String[] args){
        int n=100;
        for(int i=0;i<n;i++){
            Prime100(i);
        }
    }
        
    

