public class maxsumSubarray {
    public static void maxSumSubarrays(int numbers[]){
        int max =0;
       // int currsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                int currsum =0;
                for(int k=start;k<=end;k++){
                    //System.out.print(numbers[k]+" ");
                    currsum+=numbers[k];
                    
                }
                System.out.print(currsum);
                if(max<currsum)
                    max =currsum;

                
                System.out.println();
            }
            System.out.println();
        } 
        System.out.println("max sum of sub arrays : "+ max);
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        maxSumSubarrays(numbers);
       
    }
}
