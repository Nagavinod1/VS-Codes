public class Largeandsmall{
    public static int Large(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            
        }
        return max;


    }
    public static void main(String[] args){
        
        int arr[]={7,5,8,6,12};
        System.out.println(Large(arr));
    }
}