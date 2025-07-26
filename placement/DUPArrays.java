package placement;
public class DUPArrays{
    public static boolean inDistinct(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            for(int j=i+1;j<n;j++){
                if(curr==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,1};
        System.out.println(inDistinct(arr));
    }
}