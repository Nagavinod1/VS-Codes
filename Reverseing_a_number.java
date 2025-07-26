package practice;

public class Reverseing_a_number {
    public static void main(String args[]){
        int a =505849;
        
        int rev =0;

        while(a>0){
            int lastdigi = a%10;
            //reversing a number include a process
            rev = (rev*10)+lastdigi;
            // to update the value of a after removing eacbh last digit
            a = a/10;
        }
        System.out.println(rev);
        

    }ṇ
}
