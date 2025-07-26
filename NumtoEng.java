public class NumtoEng {
    public static String[] nums={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void Convert(int number){
        if(number==0){
            return;
        }
        int ld=number%10;
        Convert(number/=10);
        System.out.print(nums[ld]+" ");
    }
    public static void main(String[] args){
        Convert(4560);
    }
}
