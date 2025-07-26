import java.util.*;
public class Bit {
    public static int getI(int n,int i){
        if((n&(1<<i))==0){
            return 0;
        }
        return 1;
    }
    public static int setI(int n,int i){
        return (n|(1<<i));
    }
    public static int clearI(int n,int i){
        return(n&~ (1<<i));
    }
    public static int updateI(int n,int i,int newBit){
        if(newBit==0){
            return clearI(n, i);
        }
        else{
            return setI(n, i);
        }
    }
    public static int updateI2(int n,int i,int newBit){
        n=clearI(n, i);
        //int bit=newBit<<i;
        return n|(newBit<<i);
    }
    public static int clrlasti(int n,int i){
        return n&((~0)<<i);
    }
    public static int clearRangeofBits(int n,int i,int j){
        int a=((~0)<<j+1);
        int b=(1<<i)-1;
        int Bitmask=a|b;
        return n&Bitmask;
    }
    public static void main(String[] args){
        //System.out.println(getI(10, 3));
        //System.out.println(setI(10, 2));
        System.out.println(clearI(10,2));
        //System.out.println(updateI(10,2 , 1));
        //System.out.println(updateI2(10,2 , 1));
        System.out.println(clearRangeofBits(10,2,4));
    }
}
