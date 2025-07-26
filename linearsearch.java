public class linearsearch {
    public static int linser(int Num[],int key){
        for(int i= 1;i<Num.length;i++){
            if(Num[i] ==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int Num[] ={2,4,6,8,10,12,14,16};
        int key =14;
        int index =linser(Num, key);
        if(index ==-1){
            System.out.print("Not Found");
        }
        else{
            System.out.println("key is at index :"+index);
        }

    }
}
