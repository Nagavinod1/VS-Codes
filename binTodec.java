import java.util.*;
public class binTodec{
    public static void coDec(int binNum){
        int Mynum = binNum;
        int dec = 0;
        int pow=0;
        
        while(binNum>0){
            int lastDigit = binNum%2;

            dec = dec +(lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNum = binNum /10;
            
        }System.out.println( "Decimal no of "+Mynum+" = "+dec);

    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Binary Num :");
    int binNum = sc.nextInt();
    coDec(binNum);
    

    }
        
   
}