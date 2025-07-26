import java.io.*;
import java.util.*;

public class Basic1 {

    public static void main(String[] args) {
        Scanner sc=sc.nextInt();
        int n=sc.nextInt();
        int lt;
        int arr[][]=new int[n][n];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[n][n]=sc.nextInt();
                if((i+j)<=2i){
                    lt+=arr[i][j];
                }
            }
            System.out.print(lt);
        }
        
    }
}