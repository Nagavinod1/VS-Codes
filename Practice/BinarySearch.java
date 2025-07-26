public class BinarySearch {
    public static int BInSearch(int arr[],int key){
        int start=0,end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,5,14,25,26,28,31,35,41};
        int key=41;
        int index=BInSearch(arr,key);
        System.out.println("Key is at position "+index);
        

    }
}
