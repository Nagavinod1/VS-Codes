package placement;
public class subarray {
    public static void Print(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){  
            for(int j=0;j<arr.length;j++){
                int curr=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    curr+=arr[k];
                }
                System.out.println("Current sub array sum = "+curr);
                if(max<curr){
                    max=curr;
                }
            }
            System.out.println();
            
        }
        System.out.println("Max sub array sum = "+max);

    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10,12,14};
        Print(arr);
        


    }
}
