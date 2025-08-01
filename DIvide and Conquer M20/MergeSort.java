
public class MergeSort{
    public static void PrintArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        Merge(arr, si,mid, ei);
    }
    public static void Merge(int[] arr,int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i++];
            }
            else{
                temp[k]=arr[j++];
            }
            k++;
        }
        //remaining elements after right elements empty copies to temp array
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //remaining elements after left elements empty copies to temp array
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp array to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}