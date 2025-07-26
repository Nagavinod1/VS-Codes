public class Bit2 {
    public static int clrlasti(int n,int i){
        return n&((~0)<<i);
    }
    public static void main(String[] args){
        System.out.println(clrlasti(15,2));

    }
}
