public class min_max_subarray{
    
    public static void Minmaxsub(int arr[]){
        int minsum=Integer.MAX_VALUE;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int current=0;
                for(int k=i;k<=j;k++){
                    current+=arr[k];

                }
                System.out.println(current);
                if(maxsum<current){
                    maxsum=current;
                }
                if(minsum>current){
                    minsum=current;
                }
                
            }
        }
        System.out.println("Minsum : "+minsum);
        System.out.println("Maxsum : "+maxsum);
    }
    public static void main(String[] args){
        int arr[]={1,2,5,7,9};
        Minmaxsub(arr);

    }
}
