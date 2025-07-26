public class factoriL {
    public static void factorial(int num){
        int fact =1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("factorial of "+num + " = "+fact );

    }
    public static void main(String args[]){
        factorial(5);
    }
}
