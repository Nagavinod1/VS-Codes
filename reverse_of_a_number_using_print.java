package practice;

public class reverse_of_a_number_using_print {
    public static void main(String args[]){
        int a =505849;
        while(a>0){
            int lastdigi = a%10;
            System.out.print(lastdigi);
            a = a/10;
        }
    }
}
