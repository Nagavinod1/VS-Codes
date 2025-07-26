public class Largest {
    public static int lar(int num[]){
        int large =Integer.MIN_VALUE;
        for(int i =0;i<num.length;i++){
            if(large<num[i])
                large=num[i];
                
        }
        return large;
        

    }
    public static void main(String args[]){
        int num[] = {1,10,15,5,4,3,20};
        int index = lar(num);
        System.out.print("Largest is : " +index);
    }
}
