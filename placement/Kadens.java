package placement;

public class Kadens {
    public static void Kadenss(int arr[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(max, curr);
            
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        Kadenss(arr);
    }
}
