import java.util.*;
public class Reversearray{
    public static void Reverse(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        
        }

    
    public static void main(String[] args){
        int arr[]={10,11,25,26,78};
        Reverse(arr);
        
        }
    }
