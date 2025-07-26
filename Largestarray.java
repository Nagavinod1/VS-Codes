public class Largestarray{
    public static void LArgest(int arr[]){
        int l=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(l<arr[i]){
                l=arr[i];
            }
            if(s>arr[i]){
                s=arr[i];
            }  
        }
        System.out.println("LArgest is : "+l);
        System.out.println("Smallest is : "+s);

    }
    public static void main(String[] args){
        int arr[]={1,4,5,7,8,6};
        LArgest(arr);
        
    }
}