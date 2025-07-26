public class prefixarraysum {
    public static void Prefixmaxsum(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        int curr=0;
        int Maxsum=Integer.MIN_VALUE;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                System.out.println(curr);
                if(Maxsum<curr){
                    Maxsum=curr;
                   
                }
                
            }System.out.println();
        }
        System.out.println(Maxsum);     
    }
        
        
    
    public static void main(String[] args){
        int arr[]={-1,2,6,-1,3};
        Prefixmaxsum(arr);

    }
}
