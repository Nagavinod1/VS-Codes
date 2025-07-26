public class Reverse {
    public static void Rev(int num[]){
        int first=0,last=num.length-1;
        while(first<last){
            int temp =num[last];
            num[last]=num[first];
            num[first]=temp;
            last--;
            first++;
        }

    }
    public static void main(String[] args){
        int num[]={1,2,3,5,8};
        Rev(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");


        }

        

    }
    
}
