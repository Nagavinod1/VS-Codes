import java.io.*;
import java.util.*;

public class Toh {
    public static void Toh(int N,char src,char dest,char temp){
        if(N==0)
            return;
        Toh(N-1,src,temp,dest);
        System.out.println("Move "+N+" from "+src+" to "+ dest);
        Toh(N-1,temp,dest,src);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        char src='A';
        char temp='B';
        char dest='C';
        for(int i=1;i<=T;i++){
            int N=sc.nextInt();
            System.out.println((1<<N)-1);
            Toh(N,src,dest,temp);
        }
    }
}