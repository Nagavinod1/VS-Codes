public class newfeb1 {
    public static void Largest(int arr[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Largest<arr[i]){
                Largest=arr[i];
            }
        }
        System.out.println(Largest+" is the Large Number in arr[]");
    }
    public static void main(String[] args){
        int arr[]={12,145,100,55,455};
        Largest(arr);
    }
}
