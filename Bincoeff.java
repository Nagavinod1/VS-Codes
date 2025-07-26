
public class Bincoeff {
    public static int factorial(int num){
        int fact =1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void Binco(int num ,int r){
        int n_fact =factorial(num);
       int  r_fact = factorial(r);
        int nmr =num - r;
       int  nmr_fact = factorial(nmr);
        int res = n_fact /(r_fact * nmr_fact);
        System.out.print("Binomial coefficient of "+ num +"C"+r + " = "+res);

    }
    
        

    public static void main (String args[]){
        Binco(5, 2);
    }
}
