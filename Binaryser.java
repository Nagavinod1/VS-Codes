public class Binaryser {
    public static int Binser(int num[],int key){
        int start=0;
        int end =num.length-1;
        
        while(start<=end){
            int mid =(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start =mid+1;
            }
            else
                end =mid-1;
        }
        return -1;

    }
    public static void main(String[] args){
        int num[] ={1,2,4,5,18,21,25};
        int key =25;
        int res =Binser(num, key);
        System.out.println("Index of key : "+key+" is found at "+ res);
    }
}
